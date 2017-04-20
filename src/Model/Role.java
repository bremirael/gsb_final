/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author passpass
 */
public class Role {

    private int id_role;
    private String nom_role;

    /**
     *
     * @param id_role
     * @param nom_role
     */
    public Role(int id_role, String nom_role) {
        this.id_role = id_role;
        this.nom_role = nom_role;
    }

    /**
     *
     * @param nom_role
     */
    public Role(String nom_role) {
        this.nom_role = nom_role;
    }

    /**
     *
     */
    public Role() {
    }

    ;
    
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

    /**
     *
     * @return
     */
    public String getNom_role() {
        return nom_role;
    }

    /**
     *
     * @param nom_role
     */
    public void setNom_role(String nom_role) {
        this.nom_role = nom_role;
    }

}
