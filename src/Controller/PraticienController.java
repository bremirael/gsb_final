package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import Model.DaoException;
import Model.Praticien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import View.PraticienList;
import Model.Praticien;
import Model.Praticien;
import Model.PraticienDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author passpass
 */


public class PraticienController extends PraticienDAO {
      
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
    public void AjoutPraticien(String nom, String prenom, String adresse, String ville,String code_postal, String telephone, String secteur)
    {
         
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
    public boolean isValidPraticien(String nom, String prenom, String adresse, String ville, String code_postal, String telephone, String secteur)
    {
         
        boolean isValidPraticien = true;
        
        String mesErreurs ="Merci de renseigner : \n\n";
        
        if(nom.compareTo("")==0){
          mesErreurs += "- \t le nom du praticien !\n";
          isValidPraticien = false;
        }
        if(nom.contains(" ")){
          mesErreurs += "- \t le nom du praticien ne doit pas comporter d'espace!\n";
          isValidPraticien = false;
        }
         if(prenom.compareTo("")==0){
           mesErreurs += "- \t le prénom du praticien !\n";
           isValidPraticien = false ;
        }
        if(nom.contains(" ")){
          mesErreurs += "- \t le prénom du praticien ne doit pas comporter d'espace!\n";
          isValidPraticien = false;
        }
         if(adresse.compareTo("")==0){
            mesErreurs += "- \t l'adresse du praticien !\n";
            isValidPraticien = false;
        }
         if(ville.compareTo("")==0){
          mesErreurs +="- \t la ville du praticien !\n";
            isValidPraticien = false;
        }
         if(code_postal.compareTo("")==0){
           mesErreurs += "- \t le code postal du praticien ! \n";
           isValidPraticien = false;
        }
         if(telephone.compareTo("")==0){
            mesErreurs += "- \t le téléphone du praticien !\n";
            isValidPraticien = false;
        }
        
        if(secteur.compareTo("")==0){
           mesErreurs += "- \t le secteur du praticien ! \n";
           isValidPraticien = false;
        } 
         
        if(!isValidPraticien){
          JOptionPane.showMessageDialog(null,mesErreurs,"Accès refusé", JOptionPane.ERROR_MESSAGE);
        }
        
        return isValidPraticien;  
    }
    
   
    public Praticien getNomPrenomPraticien(Object rowP)
    {
        
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
   
    public String getNomPrenomPraticienById(int id_praticien){
        
            Connection connection = MysqlConnection.ConnectDB();
            Statement stPraticien;
            ResultSet rsPraticien;
        
            String queryPraticien = "SELECT nom, prenom FROM praticien WHERE id_praticien =" + id_praticien;
        
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
            
         return nomPraticien.getNom()+" "+nomPraticien.getPrenom();
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
            Logger.getLogger(PraticienController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PraticienController.class.getName()).log(Level.SEVERE, null, ex);
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
         

