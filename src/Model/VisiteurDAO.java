/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.MysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author passpass
 */
public class VisiteurDAO extends Visiteurmedical {

    /**
     * @param nom
     * @param prenom
     * @return
     */
    public Visiteurmedical getVisiteurByNomPrenom(String nom, String prenom) {
        Visiteurmedical monVisiteur = new Visiteurmedical();
        Connection connection = MysqlConnection.ConnectDB();
        String query = "SELECT * FROM visiteurmedical WHERE nom LIKE '%" + nom + "%' AND prenom LIKE '%" + prenom + "%'";

        Statement st;
        ResultSet rs;
        // JOptionPane.showMessageDialog(null, query);

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                monVisiteur = new Visiteurmedical(rs.getInt("id_visiteur"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("ville"), rs.getString("secteur"), rs.getString("labo"), rs.getInt("id_utilisateur"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return monVisiteur;
    }

    /**
     *
     * @param id_utilisateur
     * @return Visiteurmedical
     */
    public Visiteurmedical findVisiteurByIdUser(int id_utilisateur) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement stVisiteur;
        ResultSet rs;

        String queryVisiteur = "SELECT * FROM visiteurmedical WHERE id_utilisateur =" + id_utilisateur;
        Visiteurmedical monVisiteur = new Visiteurmedical();

        try {
            stVisiteur = connection.createStatement();
            rs = stVisiteur.executeQuery(queryVisiteur);

            while (rs.next()) {
                monVisiteur = new Visiteurmedical(rs.getInt("id_visiteur"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("ville"), rs.getString("secteur"), rs.getString("labo"), rs.getInt("id_utilisateur"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return monVisiteur;
    }

    /**
     *
     * @param id_utilisateur
     * @return Visiteurmedical
     */
    public boolean isVisiteurExistByIdUser(int id_utilisateur) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement stVisiteur;
        ResultSet rs;
        boolean monVisiteurExist = false;
        String queryVisiteur = "SELECT * FROM visiteurmedical WHERE id_utilisateur =" + id_utilisateur;
        Visiteurmedical monVisiteur = new Visiteurmedical();

        try {
            stVisiteur = connection.createStatement();
            rs = stVisiteur.executeQuery(queryVisiteur);

            while (rs.next()) {
                monVisiteurExist = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return monVisiteurExist;
    }

    /**
     *
     * @param id_utilisateur
     * @return Visiteurmedical
     */
    public Visiteurmedical findVisiteurById(int id_visiteur) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement stVisiteur;
        ResultSet rs;

        String queryVisiteur = "SELECT * FROM visiteurmedical WHERE id_visiteur =" + id_visiteur + " AND id_utilisateur >0";
        Visiteurmedical monVisiteur = new Visiteurmedical();

        try {
            stVisiteur = connection.createStatement();
            rs = stVisiteur.executeQuery(queryVisiteur);

            while (rs.next()) {
                monVisiteur = new Visiteurmedical(rs.getInt("id_visiteur"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("ville"), rs.getString("secteur"), rs.getString("labo"), rs.getInt("id_utilisateur"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return monVisiteur;
    }

    /**
     * Renvoie le nom +" "+ prenom du visiteur en fonction de sa clé utilisateur
     *
     * @param id_visiteur
     * @return String
     */
    public String findNomPrenomVisiteurByIdUtilisateur(int id_utilisateur) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement stVisiteur;
        ResultSet rsVisiteur = null;
        String nom = "";
        String prenom = "";
        String queryNomVisiteur = "SELECT nom, prenom FROM visiteurmedical WHERE id_utilisateur = " + id_utilisateur;

        try {
            stVisiteur = connection.createStatement();
            rsVisiteur = stVisiteur.executeQuery(queryNomVisiteur);

            while (rsVisiteur.next()) {

                nom = rsVisiteur.getString("nom");
                prenom = rsVisiteur.getString("prenom");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return nom + " " + prenom;
    }

    /**
     * Renvoie le nom +" "+ prenom du visiteur en fonction de sa clé utilisateur
     *
     * @param id_visiteur
     * @return String
     */
    public String findNomPrenomVisiteurByIdVisiteur(int id_visiteur) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement stVisiteur;
        ResultSet rsVisiteur = null;
        String nom = "";
        String prenom = "";
        String queryNomVisiteur = "SELECT nom, prenom FROM visiteurmedical WHERE id_visiteur = " + id_visiteur;

        try {
            stVisiteur = connection.createStatement();
            rsVisiteur = stVisiteur.executeQuery(queryNomVisiteur);

            while (rsVisiteur.next()) {

                nom = rsVisiteur.getString("nom");
                prenom = rsVisiteur.getString("prenom");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return nom + " " + prenom;
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param secteur
     * @param labo
     * @param id_utilisateur
     * @return boolean
     */
    public boolean addVisiteur(String nom, String prenom, String adresse, String ville, String secteur, String labo, int id_utilisateur) {

        boolean ajoutOK = false;
        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pst;

        String queryUtilisateur = "INSERT INTO visiteurmedical(nom, prenom, adresse, ville, secteur, labo, id_utilisateur) VALUES (?,?,?,?,?,?,?)";

        try {
            pst = connection.prepareStatement(queryUtilisateur);
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.setString(3, adresse);
            pst.setString(4, ville);
            pst.setString(5, secteur);
            pst.setString(6, labo);
            pst.setInt(7, id_utilisateur);

            boolean resultExec = pst.execute();

            if (!resultExec) {
                // JOptionPane.showMessageDialog(null,"Enregistrement du visiteur effectué !");
                ajoutOK = true;
            } else {
                JOptionPane.showMessageDialog(null, "Enregistrement visiteur échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
                ajoutOK = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enregistrement visiteur échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
            ajoutOK = false;
        }

        return ajoutOK;
    }

    /**
     * @param id_visiteur
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param secteur
     * @param labo
     * @param id_utilisateur
     * @return boolean
     *
     */
    public boolean editVisiteur(int id_visiteur, String nom, String prenom, String adresse, String ville, String secteur, String labo, int id_utilisateur) {

        boolean isModifOk = false;

        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pstUpdate;
        String queryUtilisateurUpdate;

        queryUtilisateurUpdate = "UPDATE visiteurmedical SET nom=?, prenom=?, adresse=?, ville=?, secteur=?, labo=?, id_utilisateur=? WHERE id_visiteur=?";

        /*
        *   Mis à jour du profil visiteur
         */
        try {

            pstUpdate = connection.prepareStatement(queryUtilisateurUpdate);
            pstUpdate.setString(1, nom);
            pstUpdate.setString(2, prenom);
            pstUpdate.setString(3, adresse);
            pstUpdate.setString(4, ville);
            pstUpdate.setString(5, secteur);
            pstUpdate.setString(6, labo);
            pstUpdate.setInt(7, id_utilisateur);
            pstUpdate.setInt(8, id_visiteur);
            pstUpdate.execute();

            isModifOk = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Enregistrement visiteur échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }
        return isModifOk;
    }
    /**
     * @param id_visiteur
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param secteur
     * @param labo
     * @param id_utilisateur
     * @return boolean
     *
     */
    public boolean editAdminVisiteur(int id_utilisateur) {

        boolean isModifOk = false;

        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pstUpdate;
        String queryUtilisateurUpdate;

        queryUtilisateurUpdate = "UPDATE visiteurmedical SET id_utilisateur=? WHERE id_utilisateur=?";

        /*
        *   Mis à jour du profil visiteur
         */
        try {

            pstUpdate = connection.prepareStatement(queryUtilisateurUpdate);
            pstUpdate.setNull(1,id_utilisateur);
            pstUpdate.setInt(2, id_utilisateur);
            pstUpdate.execute();

            isModifOk = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Enregistrement visiteur échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }
        return isModifOk;
    }

    /**
     * @param String
     * @return
     */
    public ArrayList<Visiteurmedical> getVisiteurListByTable(String myColumn) {
        ArrayList<Visiteurmedical> visiteurList = new ArrayList<Visiteurmedical>();
        Connection connection = MysqlConnection.ConnectDB();
        Statement st;
        ResultSet rs;
        /*
        *   Selectionne uniquement les visiteurs médicaux qui sont rattaché à un utilisateur, ils sont triés par la table passée en paramètre
         */
        String query = "SELECT * FROM visiteurmedical WHERE id_utilisateur>0 ORDER BY visiteurmedical." + myColumn;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Visiteurmedical visiteur;
            while (rs.next()) {
                visiteur = new Visiteurmedical(rs.getInt("id_visiteur"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("ville"), rs.getString("secteur"), rs.getString("labo"), rs.getInt("id_utilisateur"));
                JOptionPane.showMessageDialog(null, visiteur.getId_visiteur());
                visiteurList.add(visiteur);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return visiteurList;
    }
}
