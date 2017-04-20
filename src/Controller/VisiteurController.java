/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Utilisateur;
import Model.Visiteurmedical;
import Model.VisiteurDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author passpass
 */
public class VisiteurController extends VisiteurDAO {

    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param secteur
     * @param labo
     * @return
     */
    public boolean isValidVisiteur(String nom, String prenom, String adresse, String ville, String secteur, String labo) {

        boolean isValidVisiteur = true;
        String mesErreurs = "Merci de renseigner : \n\n";

        if (nom.compareTo("") == 0) {
            mesErreurs += "- \t le nom du visiteur !\n";
            isValidVisiteur = false;
        }
        if (nom.contains(" ")) {
            mesErreurs += "- \t le nom du visiteur ne doit pas comporter d'espace!\n";
            isValidVisiteur = false;
        }
        if (prenom.compareTo("") == 0) {
            mesErreurs += "- \t le prénom du visiteur !\n";
            isValidVisiteur = false;
        }
        if (nom.contains(" ")) {
            mesErreurs += "- \t le prénom du visiteur ne doit pas comporter d'espace!\n";
            isValidVisiteur = false;
        }
        if (adresse.compareTo("") == 0) {
            mesErreurs += "- \t l'adresse du visiteur !\n";
            isValidVisiteur = false;
        }
        if (ville.compareTo("") == 0) {
            mesErreurs += "- \t la ville du visiteur !\n";
            isValidVisiteur = false;
        }
        if (secteur.compareTo("") == 0) {
            mesErreurs += "- \t le secteur du visiteur ! \n";
            isValidVisiteur = false;
        }
        if (labo.compareTo("") == 0) {
            mesErreurs += "- \t le nom du laboratoire du visiteur !\n";
            isValidVisiteur = false;
        }

        if (!isValidVisiteur) {
            JOptionPane.showMessageDialog(null, mesErreurs, "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }

        return isValidVisiteur;
    }

    /**
     * Affiche la liste des utilisateurs triés par param
     *
     * @param maTable
     */
    public Object showVisiteurListInJTableByTable(DefaultTableModel model, String maTable) {

        /*
        *   getVisiteurListOrderByColumn
        *   findVisiteurById
        *   findUserById
        */
        UtilisateurController monUtilisateurC;
        VisiteurController monVisiteurC;
        monUtilisateurC = new UtilisateurController();
        monVisiteurC = new VisiteurController();

        /*
        *    findNomRoleById
         */
        RoleController monRoleC;
        Visiteurmedical monVisiteurM;
        Utilisateur monUtilisateur;

        monRoleC = new RoleController();
        monVisiteurM = new Visiteurmedical();
        monUtilisateur = new Utilisateur();

        ArrayList<Visiteurmedical> list;
        Object[] row;
        int id_utilisateur;
        int nbVisiteur;
        
        row = new Object[9];
        int i;
        
        /*  
        *   Recupere la liste triée par la colonne choisie ( champs utilisateur séléctionné )
        */
        list = monVisiteurC.getVisiteurListByTable(maTable);
        nbVisiteur = list.size();

        int nbCountM = model.getRowCount();

        /*
        *   Affiche les contenus des champs du tableaux ainsi recueillis
         */
        for (i = 0; i < nbVisiteur; i++) {

            id_utilisateur = list.get(i).getId_utilisateur();
            /*
            *   Si le visiteur est rattaché à un utilisateur
             */
            if (monUtilisateurC.isUserExistById(id_utilisateur)) {
                /*
                *   on recupere le login et l'email de chaque utilisateur
                 */
                monUtilisateur = monUtilisateurC.getUserById(id_utilisateur);

                row[0] = monUtilisateur.getLogin();
                row[1] = monUtilisateur.getEmail();

                /*
                *   on recupere le nom du role de chaque utilisateur
                 */
                row[2] = monRoleC.findNomRoleById(monUtilisateur.getId_role());

                /*
                *  on recupere les informations du visiteur medical
                 */
                monVisiteurM = monVisiteurC.findVisiteurByIdUser(id_utilisateur);
                row[3] = monVisiteurM.getNom();
                row[4] = monVisiteurM.getPrenom();
                row[5] = monVisiteurM.getAdresse();
                row[6] = monVisiteurM.getVille();
                row[7] = monVisiteurM.getSecteur();
                row[8] = monVisiteurM.getLabo();
                model.removeRow(i);
                model.addRow(row);
            } /*
            *   Si le visiteur n'est rattaché à aucun utilisateur 
             */ else if (id_utilisateur == 0) {

                // monVisiteurM = monVisiteurC.findVisiteurById(id_utilisateur);
                row[0] = "";
                row[1] = "";
                row[2] = " visiteur désactivé ";
                /*
                row[3] = monVisiteurM.getNom();
                row[4] = monVisiteurM.getPrenom();
                row[5] = monVisiteurM.getAdresse();
                row[6] = monVisiteurM.getVille();
                row[7] = monVisiteurM.getSecteur();
                row[8] = monVisiteurM.getLabo();
                 */
                row[3] = " ";
                row[4] = " ";
                row[5] = " ";
                row[6] = " ";
                row[7] = " ";
                row[8] = " ";
                model.removeRow(i);
                model.addRow(row);
            } else {
                JOptionPane.showMessageDialog(null, "Probleme avec showVisiteurLisInJTable()" + list.get(i).getId_utilisateur(), "Accès refusé", JOptionPane.ERROR_MESSAGE);

            }

        }

        return row;
    }

    /**
     *
     * @param rowV
     * @return
     */
    public Visiteurmedical getNomPrenomVisiteur(Object rowV) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement stVisiteur;
        ResultSet rsVisiteur;

        String queryVisiteur = "SELECT nom, prenom FROM visiteurmedical WHERE id_visiteur =" + rowV;
        Visiteurmedical nomVisiteur = new Visiteurmedical();

        try {
            stVisiteur = connection.createStatement();
            rsVisiteur = stVisiteur.executeQuery(queryVisiteur);

            while (rsVisiteur.next()) {
                nomVisiteur = new Visiteurmedical(rsVisiteur.getString("nom"), rsVisiteur.getString("prenom"));
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return nomVisiteur;
    }

}
