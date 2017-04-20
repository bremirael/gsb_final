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
public class Visiteurmedical {

    private int id_visiteur;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String secteur;
    private String labo;
    private int id_utilisateur;

    /**
     *
     */
    public Visiteurmedical() {

    }

    /**
     *
     * @param id_utilisateur
     */
    public Visiteurmedical(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    /**
     *
     * @param nom
     * @param prenom
     */
    public Visiteurmedical(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;
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
     */
    public Visiteurmedical(String nom, String prenom, String adresse, String ville, String secteur, String labo, int id_utilisateur) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.secteur = secteur;
        this.labo = labo;
        this.id_utilisateur = id_utilisateur;
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
     */
    public Visiteurmedical(int id_visiteur, String nom, String prenom, String adresse, String ville, String secteur, String labo, int id_utilisateur) {
        this.id_visiteur = id_visiteur;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.secteur = secteur;
        this.labo = labo;
        this.id_utilisateur = id_utilisateur;
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param secteur
     * @param labo
     *
     */
    public Visiteurmedical(String nom, String prenom, String adresse, String ville, String secteur, String labo) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.secteur = secteur;
        this.labo = labo;
    }

    /**
     * @return the id_visiteur
     */
    public int getId_visiteur() {
        return id_visiteur;
    }

    /**
     * @param id_visiteur the id_visiteur to set
     */
    public void setId_visiteur(int id_visiteur) {
        this.id_visiteur = id_visiteur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @return
     */
    public String getVille() {
        return ville;
    }

    /**
     *
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     *
     * @return
     */
    public String getSecteur() {
        return secteur;
    }

    /**
     *
     * @param secteur
     */
    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    /**
     *
     * @return
     */
    public String getLabo() {
        return labo;
    }

    /**
     *
     * @param labo
     */
    public void setLabo(String labo) {
        this.labo = labo;
    }

    /**
     *
     * @return
     */
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    /**
     *
     * @param id_utilisateur
     */
    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

}
