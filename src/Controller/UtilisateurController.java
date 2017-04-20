/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.VisiteurController;
import Controller.RoleController;

import Model.Utilisateur;
import Model.UtilisateurDAO;

import Model.Visiteurmedical;
import Model.Role;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author passpass
 */
public class UtilisateurController extends UtilisateurDAO {

    /*
    *   @param login
    *   @param password
    *   @param email
    *   @param role
    *   @return boolean
     */
    public boolean isValidUser(String login, String password, String email, int role) {

        boolean isValidUser = true;
        boolean isEmail = verifEmail(email);

        String mesErreurs = "Merci de renseigner : \n\n";

        if (login.compareTo("") == 0) {
            // verifie qu'un identifiant soit renseigné   
            mesErreurs += "- \t votre identifiant !\n";
            isValidUser = false;
        }

        if (password.length() < 6) {
            // verifie la longueur du mot de passe   
            mesErreurs += "-\t un Mot de passe comportant au minimum 6 caractères !\n";
            isValidUser = false;
        }

        if (email.compareTo("") == 0) {
            // verifie qu'un email soit renseigné   
            mesErreurs += "- \t votre adresse email ! \n";
            isValidUser = false;
        }

        if (!isEmail) {
            mesErreurs += "-\t une adresse email valide!\n";
            isValidUser = false;
        }

        if (!isValidUser) {
            JOptionPane.showMessageDialog(null, mesErreurs, "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }

        return isValidUser;

    }

    /*
    *   @param login
    *   @param email
    *   @param role
    *   @return boolean true if isValid
     */
    public boolean isValidUserNoMdp(String login, String email, int role) {

        boolean isValidUser = true;

        String mesErreurs = "Merci de renseigner : \n\n";

        boolean isEmail = verifEmail(email);

        if (login.compareTo("") == 0) {
            // verifie qu'un identifiant soit renseigné   
            mesErreurs += "- \t votre identifiant !\n";
            isValidUser = false;
        }
        if (email.compareTo("") == 0) {
            // verifie qu'un email soit renseigné   
            mesErreurs += "- \t votre adresse email ! \n";
            isValidUser = false;
        }

        if (!isEmail) {
            mesErreurs += "-\t une adresse email valide!\n";
            isValidUser = false;
        }

        if (!isValidUser) {
            JOptionPane.showMessageDialog(null, mesErreurs, "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }

        return isValidUser;
    }

    /*
    *   @param email
    *   @return boolean
     */
    public boolean verifEmail(String email) {

        boolean isEmail = false;
        boolean isEmailOk = false;
        boolean isEmailCritere1 = false;
        boolean isEmailCritere2 = false;

        String myEmail[] = email.split("");

        int longueurEmail = myEmail.length;

        for (int i = 0; i < longueurEmail; i++) {

            isEmail = myEmail[i].equals("@");

            if (isEmail) {
                isEmailCritere1 = true;
            }
        }
        for (int i = 0; i < longueurEmail; i++) {

            isEmail = myEmail[i].equals("@");

            if (isEmail) {
                isEmailCritere2 = true;
            }
        }
        if (isEmailCritere1 && isEmailCritere2) {
            isEmailOk = true;
        }

        return isEmailOk;
    }

    /**
     * @param model
     */
    public void showUserListInJTable(DefaultTableModel model) {

        VisiteurController monVisiteurC = new VisiteurController();
        Visiteurmedical monVisiteurM;

        ArrayList<Utilisateur> list = this.getUserList();

        Object[] row = new Object[9];
        int i = 0;

        for (i = 0; i < list.size(); i++) {

            /*
            *   on recupere les informations du visiteur medical 
             */
            monVisiteurM = monVisiteurC.findVisiteurByIdUser(list.get(i).getId_utilisateur());

            row[0] = list.get(i).getLogin();
            row[1] = list.get(i).getEmail();

            /*
            *   Si un profil visiteur est rattaché à l'utilisateur
             */
            if (list.get(i).getId_role() == 1) {
                row[2] = "Visiteur Médical";
                row[3] = monVisiteurM.getNom();
                row[4] = monVisiteurM.getPrenom();
                row[5] = monVisiteurM.getAdresse();
                row[6] = monVisiteurM.getVille();
                row[7] = monVisiteurM.getSecteur();
                row[8] = monVisiteurM.getLabo();

                model.addRow(row);
            } /*
            *   Si aucun profil visiteur n'est rattaché à l'utilisateur
             */ else if (list.get(i).getId_role() == 2) {
                row[2] = "Administrateur";
                row[3] = " ";
                row[4] = " ";
                row[5] = " ";
                row[6] = " ";
                row[7] = " ";
                row[8] = " ";

                model.addRow(row);
            } else {
                JOptionPane.showMessageDialog(null, "Problème avec le role de l'utilisateur: " + list.get(i).getId_role(), "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Affiche la liste des utilisateurs triés par param
     *
     * @param maTable
     */
    public Object showUserListInJTableByTable(DefaultTableModel model, String maTable) {

        /*
        *   findUserListByTable
         */
        UtilisateurController monUtilisateurC;
        VisiteurController monVisiteurC;
        RoleController monRoleC;
        Visiteurmedical monVisiteurM;
        monUtilisateurC = new UtilisateurController();
        monVisiteurC = new VisiteurController(); //findVisiteurByIdUser
        monRoleC = new RoleController();         //findNomRoleById
        monVisiteurM = new Visiteurmedical();

        ArrayList<Utilisateur> list;
        Object[] row;
        Object[] monRole;
        row = new Object[9];
        int id_utilisateur;
        int id_visiteur;
        int nbUtilisateur;
        int i;

        /*  
        *   Recupere la liste trié par la colonne choisie ( champs utilisateur séléctionné )
         */
        list = monUtilisateurC.getUserListByTable(maTable);
        nbUtilisateur = list.size();
        monRole = new Object[nbUtilisateur];

        /*
        *   Affiche les contenus des champs du tableaux ainsi recueillis
         */
        int nbCountM = model.getRowCount();

        for (i = 0; i < nbUtilisateur; i++) {

            id_utilisateur = list.get(i).getId_utilisateur();

            if (monVisiteurC.isVisiteurExistByIdUser(id_utilisateur)) {

                /*
                *   on recupere le nom du role de chaque utilisateur
                 */
                monRole[i] = monRoleC.findNomRoleById(list.get(i).getId_role());

                /*
                *   on recupere les informations du visiteur medical si il existe!!!
                 */
                monVisiteurM = monVisiteurC.findVisiteurByIdUser(id_utilisateur);

                /*
                *   Si  l'utilisateur a pas de profil visiteur
                 */
                row[0] = list.get(i).getLogin();
                row[1] = list.get(i).getEmail();
                row[2] = monRole[i];
                row[3] = monVisiteurM.getNom();
                row[4] = monVisiteurM.getPrenom();
                row[5] = monVisiteurM.getAdresse();
                row[6] = monVisiteurM.getVille();
                row[7] = monVisiteurM.getSecteur();
                row[8] = monVisiteurM.getLabo();
                model.removeRow(i);
                model.addRow(row);
            } /*
            *   Si  l'utilisateur n'a pas de profil visiteur
             */ else {
                row[0] = list.get(i).getLogin();
                row[1] = list.get(i).getEmail();
                row[2] = " Administrateur ";
                row[3] = " ";
                row[4] = " ";
                row[5] = " ";
                row[6] = " ";
                row[7] = " ";
                row[8] = " ";
                model.removeRow(i);
                model.addRow(row);
            }
        }

        return row;
    }

}
