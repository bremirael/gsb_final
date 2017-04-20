/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.BCrypt;
import Controller.MysqlConnection;
import java.security.SecureRandom;
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
public class UtilisateurDAO extends Utilisateur {

    /**
     * Renvoie l'id de l'utilisateur séléctionné par son login passé en
     * paramètre
     *
     * @param login
     * @return
     */
    public int getIdUtilisateurByLogin(String login) {

        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pst = null;
        ResultSet rs;

        int id_utilisateur = -1;
        String selectQuery = "SELECT id_utilisateur FROM utilisateur WHERE login = ?";

        try {

            pst = connection.prepareStatement(selectQuery);
            pst.setString(1, login);
            rs = pst.executeQuery();

            if (rs.next()) {
                id_utilisateur = rs.getInt("id_utilisateur");
                //  JOptionPane.showMessageDialog(null, id_utilisateur);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id_utilisateur;
    }

    /*
    *   @param id_utilisateur
    *   @return int
     */
    /**
     *
     * @param id_utilisateur
     * @return
     */
    public int isAdmin(int id_utilisateur) {
        Connection connection = MysqlConnection.ConnectDB();
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT id_role FROM utilisateur WHERE id_utilisateur=" + id_utilisateur;
        int id_role = 0;

        try {
            st = connection.prepareStatement(selectQuery);
            rs = st.executeQuery(selectQuery);

            while (rs.next()) {
                id_role = rs.getInt("id_role");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id_role;
    }

    /**
     *
     * @param monlogin
     * @return
     */
    public boolean isLoginValid(String monlogin) {

        boolean isLoginValid = true;

        Connection connection = MysqlConnection.ConnectDB();
        Statement st = null;
        ResultSet rs = null;

        String SqlLogin = "SELECT login FROM utilisateur WHERE login LIKE '%" + monlogin + "%' ";
        //JOptionPane.showMessageDialog(null,SqlLogin);

        try {
            st = connection.createStatement();
            rs = st.executeQuery(SqlLogin);

            if (rs.next()) {
                isLoginValid = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur isLoginValid(): " + monlogin + " :" + e, "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }

        return isLoginValid;
    }

    /**
     *
     * @param id_utilisateur
     * @return
     */
    public Utilisateur getUserById(int id_utilisateur) {

        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pst = null;
        ResultSet rs;
        Utilisateur monUtilisateur = null;

        String selectQuery = "SELECT * FROM utilisateur WHERE id_utilisateur = ?";
        if (id_utilisateur == 0) {
            JOptionPane.showMessageDialog(null, "Identifiant <null> !");
        } else {
            try {

                pst = connection.prepareStatement(selectQuery);
                pst.setInt(1, id_utilisateur);
                rs = pst.executeQuery();

                while (rs.next()) {
                    monUtilisateur = new Utilisateur(rs.getInt("id_utilisateur"), rs.getString("login"), rs.getString("email"), rs.getInt("id_role"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return monUtilisateur;
    }

    /**
     *
     * @param id_utilisateur
     * @return
     */
    public boolean isUserExistById(int id_utilisateur) {

        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pst = null;
        ResultSet rs;

        boolean myUserExist = false;

        String selectQuery = "SELECT * FROM utilisateur WHERE id_utilisateur = ?";

        try {

            pst = connection.prepareStatement(selectQuery);
            pst.setInt(1, id_utilisateur);
            rs = pst.executeQuery();

            while (rs.next()) {
                myUserExist = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return myUserExist;
    }

    /*
    *   @param login
        @return Utilisateur
     */
    /**
     *
     * @param login
     * @return
     */
    public Utilisateur getUserByLogin(String login) {

        Utilisateur monUtilisateur = null;
        Connection connection = MysqlConnection.ConnectDB();
        Statement st;
        ResultSet rs;

        String selectQuery = "SELECT * FROM utilisateur WHERE login LIKE '%" + login + "%'";

        try {
            st = connection.createStatement();
            rs = st.executeQuery(selectQuery);

            while (rs.next()) {
                monUtilisateur = new Utilisateur(rs.getString("login"), rs.getString("password"), rs.getString("email"), rs.getInt("id_role"), rs.getInt("id_utilisateur"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return monUtilisateur;
    }

    /**
     *
     * @param id_utilisateur
     */
    public void deleteUserById(int id_utilisateur) {

        String query = "DELETE FROM utilisateur WHERE id_utilisateur = ? ";
        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pst = null;

        try {
            pst = connection.prepareStatement(query);
            pst.setInt(1, id_utilisateur);
            boolean resultExec = pst.execute();
            // JOptionPane.showMessageDialog(null, "L'utlisateur à bien été supprimé");  
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "la Suppression de l'utilisateur à échouée", "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Renvoie une liste des utilisateurs triée par ordre croissant ( nom de
     * colonne en parametre )
     *
     * @param maTable
     * @return ArrayList Utilisateur
     */
    public ArrayList<Utilisateur> getUserListByTable(String maTable) {

        Statement st;
        ResultSet rs;
        Utilisateur monUtilisateur;
        ArrayList<Utilisateur> UtilisateurList = new ArrayList<Utilisateur>();

        String query = "SELECT * FROM utilisateur ORDER BY utilisateur." + maTable;

        try {
            Connection connection = MysqlConnection.ConnectDB();
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                monUtilisateur = new Utilisateur(rs.getInt("id_utilisateur"), rs.getString("login"), rs.getString("email"), rs.getInt("id_role"));
                UtilisateurList.add(monUtilisateur);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return UtilisateurList;
    }

    /*
     *       Renvoie la liste des utilisateurs triée par ordre alphabétique du login
     *
     * @return ArrayList Utilisateur
     */
    public ArrayList<Utilisateur> getUserList() {

        ArrayList<Utilisateur> UtilisateurList = new ArrayList<Utilisateur>();
        Connection connection = MysqlConnection.ConnectDB();

        String query = "SELECT * FROM utilisateur  ORDER BY utilisateur.login";

        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Utilisateur monUtilisateur;

            while (rs.next()) {
                monUtilisateur = new Utilisateur(rs.getInt("id_utilisateur"), rs.getString("login"), rs.getString("email"), rs.getInt("id_role"));
                UtilisateurList.add(monUtilisateur);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return UtilisateurList;
    }

    /**
     * @param login
     * @param password
     * @param email
     * @param role
     * @return
     */
    public boolean addUser(String login, String password, String email, String role) {

        Connection connection = MysqlConnection.ConnectDB();
        PreparedStatement pst = null;
        int id_role;
        boolean isAddUser = true;
        boolean loginValid;
        UtilisateurDAO monUserDAO = new UtilisateurDAO();

        SecureRandom random = new SecureRandom();

        double mondouble = 60254.32;
        double log_rounds = Math.log(mondouble);
        int log2 = (int) log_rounds;

        BCrypt mdpChiffre = new BCrypt();//hash

        String salt = BCrypt.gensalt(log2, random);

        String passwordSecure = mdpChiffre.hashpw(password, salt);

        String queryUtilisateur;

        if (role.compareTo("Administrateur") == 0) {
            id_role = 2;
        } else {
            id_role = 1;
        }

        loginValid = monUserDAO.isLoginValid(login);

        if (loginValid) {
            // securise le mot de passe en base de données

            queryUtilisateur = "INSERT INTO utilisateur(login, password, email, id_role) VALUES (?,?,?,?)";

            try {
                pst = connection.prepareStatement(queryUtilisateur);
                pst.setString(1, login);
                pst.setString(2, passwordSecure);
                pst.setString(3, email);
                pst.setInt(4, id_role);

                pst.execute();

                //  JOptionPane.showMessageDialog(null,"Enregistrement de l'utilisateur effectué !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "fonction AjoutUtilisateur: " + e + " " + login + " " + password + " " + email + " + " + id_role, "Accès refusé", JOptionPane.ERROR_MESSAGE);
                isAddUser = false;
            }
        } //  Le login existe déjà
        else {
            JOptionPane.showMessageDialog(null, "L'identifiant " + login + " existe déjà !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
            isAddUser = false;
        }

        return isAddUser;
    }

    /**
     *
     * @param login
     * @param password
     * @param email
     * @param role
     * @param id_utilisateur
     * @return
     */
    public boolean editUser(String login, String password, String email, String role, int id_utilisateur) {

        Connection connection = MysqlConnection.ConnectDB();

        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        int id_role;

        if (role.compareTo("Administrateur") == 0) {
            id_role = 2;
        } else {
            id_role = 1;
        }

        boolean isModifOk = false;

        // verifier si le mot de passe doit etre changé ou non
        if (password.compareTo("") != 0) {
            // securise le mot de passe en base de données
            SecureRandom random = new SecureRandom();
            double mondouble = 60254.32;
            double log_rounds = Math.log(mondouble);
            int log2 = (int) log_rounds;
            BCrypt mdpChiffre = new BCrypt();//hash
            String salt = BCrypt.gensalt(log2, random);
            String passwordSecure = mdpChiffre.hashpw(password, salt);

            String queryUtilisateur = "UPDATE utilisateur SET login=? ,password=?, email=?, id_role=? WHERE id_utilisateur = ?";

            
            try {
                pst = connection.prepareStatement(queryUtilisateur);
                pst.setString(1, login);
                pst.setString(2, passwordSecure);
                pst.setString(3, email);
                pst.setInt(4, id_role);
                pst.setInt(5, id_utilisateur);

                boolean resultExec = pst.execute();

                if (!resultExec) {
                    //     JOptionPane.showMessageDialog(null,"Modification de l'utilisateur effectué ( avec mot de passe ) !");
                    isModifOk = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Modification de l'utilisateur ( avec mot de passe ) échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
                    isModifOk = false;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "fonction AjoutUtilisateur: " + e + " " + login + " " + password + " " + email + " + " + id_role, "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // requete UPDATE dans le cas où l'on ne change pas le mot de passe

            String queryUtilisateur2 = "UPDATE utilisateur SET login=? , email=?, id_role=? WHERE id_utilisateur = ?";

            try {
                pst2 = connection.prepareStatement(queryUtilisateur2);
                pst2.setString(1, login);
                pst2.setString(2, email);
                pst2.setInt(3, id_role);
                pst2.setInt(4, id_utilisateur);

                boolean resultExec = pst2.execute();

                if (!resultExec) {
                    //   JOptionPane.showMessageDialog(null,"Modification de l'utilisateur effectué !");
                    isModifOk = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Modification de l'utilisateur échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
                    isModifOk = false;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "fonction AjoutUtilisateur: " + e + " " + login + " " + password + " " + email + " + " + id_role, "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }

            // JOptionPane.showMessageDialog(null, "L'identifiant "+login+" existe déjà !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
            //isModifOk= false;
        }
        return isModifOk;
    }

}
