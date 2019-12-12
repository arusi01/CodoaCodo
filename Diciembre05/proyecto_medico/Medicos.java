package proyecto_medico;

import java.util.ArrayList;
import java.util.List;

public class Medicos {

    private int id;
    private String nombre;
    private String apellido;
    private Especialidad especialidad;
    
    private List<Turnos> listaturnos = new ArrayList<>();

    public Medicos(int id, String nombre, String apellido, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turnos> getListaturnos() {
        return listaturnos;
    }

    public void setListaturnos(List<Turnos> listaturnos) {
        this.listaturnos = listaturnos;
    }

    @Override
    public String toString() {
        return "Medicos{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad.getNombre() + ", listaturnos=" + listaturnos + '}';
    }


    
}
