/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author elise
 */
public class Utilisateur {

    private int id_utilisateur;
    private String login;
    private String password;
    private String email;
    private int id_role;

    /**
     *
     */
    public Utilisateur() {

    }

    /**
     *
     * @param login
     * @param password
     * @param email
     * @param id_role
     */
    public Utilisateur(String login, String password, String email, int id_role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.id_role = id_role;
    }

    /**
     *
     * @param login
     * @param password
     * @param email
     * @param id_role
     * @param id_utilisateur
     */
    public Utilisateur(String login, String password, String email, int id_role, int id_utilisateur) {

        this.login = login;
        this.password = password;
        this.email = email;
        this.id_role = id_role;
        this.id_utilisateur = id_utilisateur;
    }

    /**
     *
     * @param login
     * @param email
     * @param id_role
     */
    public Utilisateur(String login, String email, int id_role) {
        this.login = login;
        this.email = email;
        this.id_role = id_role;
    }

    /**
     * @param id_utilisateur
     * @param login
     * @param email
     * @param id_role
     */
    public Utilisateur(int id_utilisateur, String login, String email, int id_role) {
        this.id_utilisateur = id_utilisateur;
        this.login = login;
        this.email = email;
        this.id_role = id_role;
    }

    /**
     * @return the id_utilisateur
     */
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    /**
     * @param id_utilisateur the id_utilisateur to set
     */
    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getId_role() {
        return id_role;
    }

    /**
     *
     * @param id_role
     */
    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

}
