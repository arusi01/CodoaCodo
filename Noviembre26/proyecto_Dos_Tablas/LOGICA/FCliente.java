package LOGICA;

import DATOS.VCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FCliente {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
//    private Integer totalRegistros;

    public boolean insertar(VCliente dts) {
        sSQL="insert into personas(nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email) "
                + "values(?,?,?,?,?,?,?,?);";
        sSQL2="insert into cliente(idpersona,codigo_cliente) "
                + "values((select from personas order by idpersona desc limit 1),?);";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL); //persona
            PreparedStatement pst2 = cn.prepareStatement(sSQL2); //cliente  
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApaterno());
            pst.setString(3, dts.getAmaterno());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());
            
            pst2.setString(1, dts.getCodigo_cliente());
            
            int n = pst.executeUpdate();
            
            if (n !=0) {
                int n2 = pst2.executeUpdate();
                if (n2 !=0) {
                    return true;
                }
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
