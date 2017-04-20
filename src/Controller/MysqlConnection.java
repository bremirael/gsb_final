
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Gaël Bernaténé et passpass
 * 
 */

public class MysqlConnection {
  
    Connection conn = null;
    
    /**
     *
     * @return
     */
    public static Connection ConnectDB()
    {      
        String url = "jdbc:mysql://gsb.websock.fr/gsb_ppe?zeroDateTimeBehavior=convertToNull&useSSL=true"; 
        String user = "gsb_ppe";
        String passwd = "gsb_ppe";
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, passwd);
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }     
        return null;
    }        
}