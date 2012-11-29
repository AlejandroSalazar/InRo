/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class BaseDeDatos {
    
    private static BaseDeDatos bd;
    private Connection con;
    
    private BaseDeDatos() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;databaseName=inro;user=sa;password=123;";
            con = DriverManager.getConnection(connectionUrl);
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoRopa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatalogoRopa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static BaseDeDatos getInstance() {
        if(bd == null)
            bd = new BaseDeDatos();
        return bd;
    }
    
    public int queryUpdate(String query) throws SQLException{
        Statement st = con.createStatement();
        return st.executeUpdate(query);
    }
    
}
