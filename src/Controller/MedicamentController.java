/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Medicament;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author passpass
 */
public class MedicamentController {

    /**
     *
     * @param denomination
     * @param laboratoire
     * @param quantite
     */
    public void AjoutMedicament(String denomination, String laboratoire, String quantite) {

        Connection connection = MysqlConnection.ConnectDB();

        PreparedStatement pst = null;

        float quantite1 = Float.parseFloat(quantite);
        int quantiteStock = (int) quantite1;

        try {

            String query = "INSERT INTO medicament(denomination, laboratoire, quantiteStock) VALUES (?,?,?)";

            pst = connection.prepareStatement(query);
            pst.setString(1, denomination);
            pst.setString(2, laboratoire);
            pst.setInt(3, quantiteStock);

            boolean resultExec = pst.execute();

            if (!resultExec) {
                JOptionPane.showMessageDialog(null, "Médicament bien Ajouté");
            } else {
                JOptionPane.showMessageDialog(null, "Problème survenu durant l'ajout !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicamentController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problème survenu durant l'ajout !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     *
     * @param denominationAvant
     * @param denomination
     * @param laboratoire
     * @param quantite
     */
    public void EditMedicament(String denominationAvant, String denomination, String laboratoire, String quantite) {

        Connection connection = MysqlConnection.ConnectDB();

        PreparedStatement pst = null;

        float quantite1 = Float.parseFloat(quantite);
        int quantiteStock = (int) quantite1;

        try {

            String query = "UPDATE medicament SET denomination = ?, laboratoire = ?,quantiteStock = ? WHERE denomination = \"" + denominationAvant + "\"";

            pst = connection.prepareStatement(query);
            pst.setString(1, denomination);
            pst.setString(2, laboratoire);
            pst.setInt(3, quantiteStock);

            boolean resultExec = pst.execute();

            if (!resultExec) {
                JOptionPane.showMessageDialog(null, "Médicament bien Modifié");
            } else {
                JOptionPane.showMessageDialog(null, "Problème survenu durant la modification !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicamentController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problème survenu durant la modification !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     *
     * @param denomination
     */
    public void DeleteMedicament(String denomination) {

        Connection connection = MysqlConnection.ConnectDB();

        PreparedStatement pst = null;

        try {

            String query = "DELETE FROM medicament WHERE denomination = ? ";

            pst = connection.prepareStatement(query);
            pst.setString(1, denomination);

            boolean resultExec = pst.execute();

            if (!resultExec) {
                JOptionPane.showMessageDialog(null, "Médicament bien Supprimé");
            } else {
                JOptionPane.showMessageDialog(null, "Problème survenu durant la suppression ! " + denomination, "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicamentController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problème survenu durant la suppression !" + denomination, "Accès refusé", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     *
     * @return
     */
    public ArrayList<Medicament> getMedicamentList() {
        ArrayList<Medicament> medicamentList = new ArrayList<Medicament>();
        Connection connection = MysqlConnection.ConnectDB();

        String query = "SELECT * FROM  medicament ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Medicament medicament;
            while (rs.next()) {
                medicament = new Medicament(rs.getString("denomination"), rs.getString("laboratoire"), rs.getInt("quantiteStock"));
                medicamentList.add(medicament);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicamentList;
    }

    /**
     *
     * @param denomination
     * @return
     */
    public Medicament selectMedicamentByDenomination(String denomination) {

        Connection connection = MysqlConnection.ConnectDB();

        String query = "SELECT * FROM  medicament WHERE denomination = '" + denomination + "'";
        Statement st;
        ResultSet rs;
        Medicament medicament = null;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                medicament = new Medicament(rs.getString("denomination"), rs.getString("laboratoire"), rs.getInt("quantiteStock"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicament;
    }

    public Medicament showDenominationById(int id) throws SQLException {

        Connection connection = MysqlConnection.ConnectDB();

        String query = "SELECT denomination FROM  medicament WHERE id_medicament = '" + id + "'";
        Statement st;
        ResultSet rs;
        Medicament medicament = null;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                medicament = new Medicament(rs.getString("denomination"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        connection.close();
        return medicament;
    }

}
