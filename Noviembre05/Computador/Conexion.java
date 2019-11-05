package NOV05_Computador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/computador", "root", "");
            Statement st = (Statement) con.createStatement();
            System.out.println("coneccion exitosa");
            
            // Insertar
            String sql = "insert into productos(cod_producto,descripcion,pCompraUSD,pCompraPesos,pVentaPesos,id_tipo_producto)" 
                    + "values ('002','DDR4 4GB',3,180,300,1);";
      //      st.execute(sql);

            
            // Seleccionar
            String sql1= "select * from productos";
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()) {
                System.out.println("Cod.Producto : "+rs.getString("cod_producto"));
                System.out.println("Descripcion: "+rs.getString("descripcion"));
                System.out.println("Precio Compra USD: "+rs.getFloat("pCompraUSD"));
                System.out.println("Precio Compra Pesos: "+rs.getFloat("pCompraPesos"));
                System.out.println("Precio Venta Pesos: "+rs.getFloat("pVentaPesos"));
                System.out.println("Id Tipo Producto: "+rs.getInt("id_tipo_producto"));                
                System.out.println("");                 
            }

            // Borrar
            String sql2= "delete from productos where cod_producto=2;";
            st.execute(sql2);
            
            // Actualizar
            String sql3= "update productos set pVentaPesos=500 where cod_producto=1;";
            st.execute(sql3);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);   
        }
        return con;
    }
}
