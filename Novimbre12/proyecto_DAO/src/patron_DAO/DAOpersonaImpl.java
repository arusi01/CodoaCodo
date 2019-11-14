package patron_DAO;

import consulta_general_jdbc.Persona;
import interfaces.DAOpersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOpersonaImpl extends Conexion implements DAOpersona{
    
    public static Statement sentencia;
    public static ResultSet resultado;
    
    @Override
    public void registrar(Persona per){
        try {
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement
                ("insert into personas(idpersona,nombre,apellido) values (?,?,?);");
                st.setInt(1, per.getId());
                st.setString(2, per.getNombre());
                st.setString(3, per.getApellido());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Persona per) {
        try {
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement
                    ("update personas set nombre=?, apellido=? where idpersona=?;");
                st.setString(1, per.getNombre());
                st.setString(2, per.getApellido());
                st.setInt(3, per.getId());                
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void eliminar(Persona per) {
        try {
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement
                    ("delete from personas where idpersona=?");
                st.setInt(1, per.getId());                
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos borrados correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Persona> listar() {
        List<Persona> lista = null;
        try {        
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement
                    ("select * from personas;");
                lista = new ArrayList();
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Persona cod = new Persona();
                    cod.setId(rs.getInt("idpersona"));
                    cod.setNombre(rs.getString("nombre"));
                    cod.setApellido(rs.getString("apellido"));
                    lista.add(cod);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
