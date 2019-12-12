package proyecto_medico;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    
    private List<Turnos> listaturnos = new ArrayList<>();

    public Paciente(int id, String nombre, String apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Turnos> getListaturnos() {
        return listaturnos;
    }

    public void setListaturnos(List<Turnos> listaturnos) {
        this.listaturnos = listaturnos;
    }
    
    
}
