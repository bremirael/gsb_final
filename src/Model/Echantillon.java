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
public class Echantillon 
{
    private int id_echantillon;
    private String ref_echantillon;
  
    /**
     *
     */
    public Echantillon()
    {
        
    }
    
    /**
     *
     * @param ref_echantillon
     */
    public Echantillon(String ref_echantillon){
     
        this.ref_echantillon = ref_echantillon;
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

    /**
     * @return the nom
     */
    public String getRef_echantillon() {
        return ref_echantillon;
    }

    /**
     * @param ref_echantillon the nom to set
     */
    public void setRef_echantillon(String ref_echantillon) {
        this.ref_echantillon = ref_echantillon;
    }

  
}
