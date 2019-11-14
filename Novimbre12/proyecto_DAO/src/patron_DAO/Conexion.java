package patron_DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    public Conexion() {
    }

    public Connection coneccion() throws ClassNotFoundException{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/persona", "root", "");
//            JOptionPane.showMessageDialog(null, "Coneccion Exitosa");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);   
        }
        return con;
    }
}
