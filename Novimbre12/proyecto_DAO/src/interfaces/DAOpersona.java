package interfaces;

import consulta_general_jdbc.Persona;
import java.util.List;

public interface DAOpersona {
    
    public void registrar(Persona per);
    public void modificar(Persona per);
    public void eliminar(Persona per);
    public List<Persona> listar();
}

