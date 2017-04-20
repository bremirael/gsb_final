/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.BCrypt;
import Controller.MysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ENODO02
 */
public class PraticienDAO extends Praticien {
    
    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param ville
     * @param code_postal
     * @param telephone
     * @param secteur
     * @return boolean
     */
    
    //Ajout
    public void AjoutPraticien(String nom, String prenom, String adresse, String ville,String code_postal, String telephone, String secteur){
         
        Connection connection = MysqlConnection.ConnectDB();     
      
        PreparedStatement pst = null;
        
        String queryUtilisateur = "INSERT INTO praticien(nom, prenom, adresse, ville, code_postal, telephone, secteur) VALUES (?,?,?,?,?,?,?)";

        try {
            pst = connection.prepareStatement(queryUtilisateur);
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.setString(3, adresse);
            pst.setString(4, ville);
            pst.setString(5, code_postal);
            pst.setString(6, telephone);
            pst.setString(7, secteur);
            
           boolean resultExec = pst.execute();
         

            if (!resultExec) {
                JOptionPane.showMessageDialog(null,"Ajout effectué !");
            } else {
                JOptionPane.showMessageDialog(null, "Ajout échoué !", "Accès refusé", JOptionPane.ERROR_MESSAGE);
            }  

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"fonction AjoutPraticien: "+ e +" "+nom+" "+prenom+" "+adresse+" "+ville+" "+code_postal+" "+telephone+" "+secteur);
        }
                
    }
    
   
    public Praticien getNomPrenomPraticien(Object rowP){
        
            Connection connection = MysqlConnection.ConnectDB();
            Statement stPraticien;
            ResultSet rsPraticien;
        
            String queryPraticien = "SELECT nom, prenom FROM praticien WHERE id_praticien =" + rowP;
        
            Praticien nomPraticien = new Praticien();
            
            try{
                stPraticien = connection.createStatement();
                rsPraticien = stPraticien.executeQuery(queryPraticien);
            
                while (rsPraticien.next()) {
                    nomPraticien = new Praticien(rsPraticien.getString("nom"), rsPraticien.getString("prenom"));
                }
                
            }catch (Exception e) {
                e.printStackTrace();
            }
            
         return nomPraticien;
    }
   
    public void EditPraticien(String NomPrenom, String nom, String prenom, String adresse, String ville, String code_postal, String telephone, String secteur) {                                          
       
        Connection connection = MysqlConnection.ConnectDB();
        
        PreparedStatement pst = null;     
           
                
        try {
                
            String query = "UPDATE praticien SET nom = ?, prenom = ?, adresse = ?, ville = ?, code_postal = ?, telephone = ?, secteur = ? WHERE nom = \"" +NomPrenom+"\"";
            
            pst = connection.prepareStatement(query);
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.setString(3, adresse);
            pst.setString(4, ville);
            pst.setString(5, code_postal);
            pst.setString(6, telephone);
            pst.setString(7, secteur);
      
            boolean resultExec  = pst.execute();

            if (!resultExec) {
                JOptionPane.showMessageDialog(null, "Praticien bien Modifié");
            } else {
                JOptionPane.showMessageDialog(null, "Problème survenu durant la modification !");
            }  

        } catch (SQLException ex) {
            Logger.getLogger(PraticienDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problème survenu durant la modification !");
        }
       
    }
    
    public void DeletePraticien(String nom) {                                          
       
        Connection connection = MysqlConnection.ConnectDB();
        
        PreparedStatement pst = null;     
    
        try {
                
            String query = "DELETE FROM praticien WHERE nom = ? ";
            
            pst = connection.prepareStatement(query);
            pst.setString(1, nom);
        
            boolean resultExec  = pst.execute();

            if (!resultExec) {
                JOptionPane.showMessageDialog(null, "Praticien bien Supprimé");
            } else {
                JOptionPane.showMessageDialog(null, "Problème survenu durant la suppression ! "+nom);
            }  

        } catch (SQLException ex) {
            Logger.getLogger(PraticienDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problème survenu durant la suppression ! "+nom);
        }
        
    }
        
        public ArrayList<Praticien> getPraticienList()
    {
        ArrayList<Praticien> praticienList = new ArrayList<Praticien>();
        Connection connection = MysqlConnection.ConnectDB();
       
        String query = "SELECT * FROM  praticien ";
        Statement st;
        ResultSet rs;
       
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Praticien praticien;
            while(rs.next())
            {
                praticien = new Praticien(rs.getInt("id_praticien"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("ville"), rs.getString("code_postal"), rs.getString("telephone"), rs.getString("secteur"));
                praticienList.add(praticien);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return praticienList;
    }
        
       public Praticien selectPraticienByNom(String nom){
        
        Connection connection = MysqlConnection.ConnectDB();
       
        String query = "SELECT * FROM  praticien WHERE nom = '"+nom+"'";
        Statement st;
        ResultSet rs;
        Praticien praticien=null;

          try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next())
            {
                praticien = new Praticien(rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("ville"), rs.getString("code_postal"), rs.getString("telephone"), rs.getString("secteur"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return praticien;
    }     
}
