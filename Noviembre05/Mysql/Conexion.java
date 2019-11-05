package NOV05_BD_POO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public Conexion() {
    }

    public Connection obtener() throws ClassNotFoundException{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/bd", "root", "");
            Statement st = (Statement) con.createStatement();
            System.out.println("coneccion exitosa");

            // Insertar
            String sql = "insert into usuario(nombre,apellido,edad,sexo) "
                    + "values ('Tomi','Montana','38','M')";
            st.execute(sql);

            st.execute("insert into usuario(nombre,apellido,edad,sexo) "
                    + "values ('Alberto','Perez','35','M')");
            
            // Seleccionar
            String sql1= "select * from usuario";
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("nombre"));
                System.out.println("Apellido: "+rs.getString("apellido"));
                System.out.println("Edad: "+rs.getString("edad"));
                System.out.println("Sexo: "+rs.getString("sexo"));
                System.out.println("");                 
            }

            // Borrar
            String sql2= "delete from usuario where nombre='Tomi';";
            st.execute(sql2);

            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);   
        }
        return con;
    }
}
