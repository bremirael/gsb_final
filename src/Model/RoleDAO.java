/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.MysqlConnection;
import Model.Role;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author passpass
 */
public class RoleDAO extends Role {

    /**
     *
     * @return
     */
    public int countAllRole() {

        Connection connection = MysqlConnection.ConnectDB();
        Statement st;
        ResultSet rs;

        int roleCount = 0;

        String query = "SELECT * FROM role ";

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                roleCount++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return roleCount;

    }

    /**
     *
     * @return
     */
    public String findNomRoleById(int id_role) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement st;
        ResultSet rs;
        String roleNom = "";

        String query = "SELECT nom_role FROM role WHERE id_role= " + id_role;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                roleNom = rs.getString("nom_role");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return roleNom;
    }

    /**
     *
     * @return
     */
    public int findIdRoleByNom(String nom_role) {

        Connection connection = MysqlConnection.ConnectDB();
        Statement st;
        ResultSet rs;
        int id_role = 0;

        String query = "SELECT nom_role FROM role WHERE id_role= " + id_role;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                id_role = rs.getInt("id_role");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return id_role;
    }
}
