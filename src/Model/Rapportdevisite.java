/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.beans.PropertyChangeSupport;
import java.io.Serializable;

import java.util.Date;

/**
 *
 * @author passpass
 */
public class Rapportdevisite implements Serializable {

    
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
   
    private Integer id_rapport;
  
    private String bilan;
  
    private Date date_visite;
  
    private String motifvisite;
   
    private Integer id_echantillon;
   
    private Integer id_praticien;
  
    private Integer id_visiteur;

    /**
     *
     * @param bilan
     * @param motifvisite
     * @param date_visite
     * @param id_echantillon
     * @param id_praticien
     * @param id_visiteur
     */
    public Rapportdevisite(String bilan, String motifvisite, Date date_visite, int id_visiteur, int id_praticien, int id_echantillon){
      
        this.bilan = bilan;
        this.motifvisite = motifvisite;
        this.date_visite = date_visite;
        this.id_praticien = id_praticien;
        this.id_visiteur = id_visiteur;
        this.id_echantillon = id_echantillon;  
    }

    /**
     *
     * @param id_rapport
     */
    public Rapportdevisite(Integer id_rapport) {
        this.id_rapport = id_rapport;
    }

    /**
     *
     * @return
     */
    public Integer getIdRapport() {
        return id_rapport;
    }

    /**
     *
     * @param id_rapport
     */
    public void setIdRapport(Integer id_rapport) {
        Integer oldIdRapport = this.id_rapport;
        this.id_rapport = id_rapport;
        changeSupport.firePropertyChange("id_rapport", oldIdRapport, id_rapport);
    }

    /**
     *
     * @return
     */
    public String getBilan() {
        return bilan;
    }

    /**
     *
     * @param bilan
     */
    public void setBilan(String bilan) {
        String oldBilan = this.bilan;
        this.bilan = bilan;
        changeSupport.firePropertyChange("bilan", oldBilan, bilan);
    }

    /**
     *
     * @return
     */
    public Date getDate_visite() {
        return date_visite;
    }

    /**
     *
     * @param date_visite
     */
    public void setDate_visite(Date date_visite) {
        Date oldDate_visite = this.date_visite;
        this.date_visite = date_visite;
        changeSupport.firePropertyChange("date_visite", oldDate_visite, date_visite);
    }

    /**
     *
     * @return
     */
    public String getMotifvisite() {
        return motifvisite;
    }

    /**
     *
     * @param motifvisite
     */
    public void setMotifvisite(String motifvisite) {
        String oldMotifvisite = this.motifvisite;
        this.motifvisite = motifvisite;
        changeSupport.firePropertyChange("motifvisite", oldMotifvisite, motifvisite);
    }

    /**
     *
     * @return
     */
    public Integer getIdechantillon() {
        return id_echantillon;
    }

    /**
     *
     * @param id_echantillon
     */
    public void setIdechantillon(Integer id_echantillon) {
        Integer oldIdechantillon = this.id_echantillon;
        this.id_echantillon = id_echantillon;
        changeSupport.firePropertyChange("id_echantillon", oldIdechantillon, id_echantillon);
    }

    /**
     *
     * @return
     */
    public Integer getIdpraticien() {
        return id_praticien;
    }

    /**
     *
     * @param id_praticien
     */
    public void setIdpraticien(Integer id_praticien) {
        Integer oldIdpraticien = this.id_praticien;
        this.id_praticien = id_praticien;
        changeSupport.firePropertyChange("id_praticien", oldIdpraticien, id_praticien);
    }

    /**
     *
     * @return
     */
    public Integer getIdvisiteur() {
        return id_visiteur;
    }

    /**
     *
     * @param id_visiteur
     */
    public void setIdvisiteur(Integer id_visiteur) {
        Integer oldIdvisiteur = this.id_visiteur;
        this.id_visiteur = id_visiteur;
        changeSupport.firePropertyChange("id_visiteur", oldIdvisiteur, id_visiteur);
    }


    
}
