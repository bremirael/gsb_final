package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.Echantillon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author passpass
 */
public class EchantillonController {
    
    /**
     *
     * @param rowE
     * @return
     */
    public Echantillon getRef_Echantillon(Object rowE){
     
            Connection connection = MysqlConnection.ConnectDB();
            Statement stEchantillon;
            ResultSet rsEchantillon;
            
       
            Echantillon marefEchantillon=new Echantillon();
                 
            String queryEchantillon = "SELECT ref_echantillon FROM  echantillon WHERE id_echantillon =" + rowE;
            try{
                stEchantillon = connection.createStatement();
                rsEchantillon = stEchantillon.executeQuery(queryEchantillon);
            
                while (rsEchantillon.next()) {
                   marefEchantillon = new Echantillon(rsEchantillon.getString("ref_echantillon"));
                }
                
            }catch (Exception e) {
                e.printStackTrace();
            }
            
            return marefEchantillon;

    }
}
