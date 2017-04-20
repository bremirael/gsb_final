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
public class Praticien 
{
    private int id_praticien;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String code_postal;
    private String secteur;
    private String telephone;
    
    /**
     *
     */
    public Praticien()
    {
    
    }
    
    public Praticien(String nom, String prenom, int id_praticien)
    {
       this.nom = nom;
       this.prenom = prenom; 
       this.id_praticien = id_praticien;
    }
    
    public Praticien(int id_praticien, String nom, String prenom)
    {
       this.id_praticien = id_praticien;
       this.nom = nom;
       this.prenom = prenom; 
    }
    
    /**
     *
     * @param nom
     * @param prenom
     */
    public Praticien(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
        
    }
    
    /**
     *
     * @param id_praticien
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param code_postal
     * @param secteur
     * @param telephone
     */
    public Praticien(int id_praticien, String nom,  String prenom, String adresse, String ville, String code_postal, String telephone, String secteur)
    {
        this.id_praticien = id_praticien;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.code_postal = code_postal;
        this.telephone = telephone;
        this.secteur = secteur;
    }
    
    
    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param code_postal
     * @param secteur
     * @param telephone
     */
    public Praticien(String nom,  String prenom, String adresse, String ville, String code_postal, String secteur, String telephone)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.code_postal = code_postal;
        this.secteur = secteur;
        this.telephone = telephone;
    }
    
    public Praticien(String nom,  String prenom, String adresse, String ville, String code_postal, String secteur, String telephone, int id_praticien)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.code_postal = code_postal;
        this.secteur = secteur;
        this.telephone = telephone;
        this.id_praticien = id_praticien;
    }
    
    /**
     *
     * @param nom
     */
    public Praticien(String nom)
    {
        this.nom = nom;
    }
/*
    public Praticien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
   
    /**
     * @return the id_praticien
     */
    public int getId_praticien() {
        return id_praticien;
    }

    /**
     * @param id_praticien the id_praticien to set
     */
    public void setId_praticien(int id_praticien) {
        this.id_praticien = id_praticien;
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
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the code_postal
     */
    public String getCode_postal() {
        return code_postal;
    }

    /**
     * @param code_postal the code_postal to set
     */
    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    /**
     * @return the secteur
     */
    public String getSecteur() {
        return secteur;
    }

    /**
     * @param secteur the secteur to set
     */
    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     *
     * @return
     */
    public String toString02() {
        return "Praticien{" + "id_praticien=" + id_praticien + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville + ", code_postal=" + code_postal + " secteur=" + secteur + ", telephone=" + telephone + '}';
    }
    
    @Override
    public String toString(){
        return nom + " " + prenom ;
    }
}
