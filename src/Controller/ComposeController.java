/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Compose;
import Model.Rapportdevisite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author elise
 */
public class ComposeController {

    public ArrayList<Compose> getComposeList(int id_echantillon) {

        ArrayList<Compose> composeList = new ArrayList<>();
        Connection connection = MysqlConnection.ConnectDB();

        String query = "SELECT * FROM compose WHERE id_echantillon = " + id_echantillon;

        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Compose compose;
            while (rs.next()) {
                compose = new Compose(rs.getInt("quantite"), rs.getInt("id_medicament"), rs.getInt("id_echantillon"));
                composeList.add(compose);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return composeList;
    }

}
