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
public class Compose 
{
    private int quantite;
    private int id_medicament;
    private int id_echantillon;

    public Compose()
    {
        
    }
    
    public Compose(int quantite)
    {
        this.quantite = quantite;
    }
    
    public Compose(int quantite, int id_medicament, int id_echantillon)
    {
        this.quantite = quantite;
        this.id_medicament = id_medicament;
        this.id_echantillon = id_echantillon;
    }
    
    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the id_medicament
     */
    public int getId_medicament() {
        return id_medicament;
    }

    /**
     * @param id_medicament the id_medicament to set
     */
    public void setId_medicament(int id_medicament) {
        this.id_medicament = id_medicament;
    }

    /**
     * @return the id_echantillon
     */
    public int getId_echantillon() {
        return id_echantillon;
    }

    /**
     * @param id_echantillon the id_echantillon to set
     */
    public void setId_echantillon(int id_echantillon) {
        this.id_echantillon = id_echantillon;
    }
}
