package LOGICA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    public String db = "negocio";
    public String url = "jdbc:mysql://localhost:3308/" + db;
    public String usuario = "root";
    public String password = "";
    
    public Conexion(){
        
    }
    
    public Connection conectar(){
        Connection con = null;
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(this.url, this.usuario, this.password);
                JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Exito", 1);
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return con;
        
    }
    
    
}
