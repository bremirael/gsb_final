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
public class Medicament {

    private int id_medicament;
    private String denomination;
    private String laboratoire;
    private int quantiteStock;

    /**
     *
     */
    public Medicament() {

    }

    /**
     *
     * @param denomination
     */
    public Medicament(String denomination) {
        this.denomination = denomination;
    }

    /**
     *
     * @param denomination
     * @param laboratoire
     * @param quantiteStock
     */
    public Medicament(String denomination, String laboratoire, int quantiteStock) {
        this.denomination = denomination;
        this.laboratoire = laboratoire;
        this.quantiteStock = quantiteStock;
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
     * @return the denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * @param denomination the denomination to set
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    /**
     * @return the laboratoire
     */
    public String getLaboratoire() {
        return laboratoire;
    }

    /**
     * @param laboratoire the laboratoire to set
     */
    public void setLaboratoire(String laboratoire) {
        this.laboratoire = laboratoire;
    }

    /**
     * @return the quantiteStock
     */
    public int getQuantiteStock() {
        return quantiteStock;
    }

    /**
     * @param quantiteStock the quantiteStock to set
     */
    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

}
