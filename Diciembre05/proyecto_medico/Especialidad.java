package proyecto_medico;

import java.util.ArrayList;
import java.util.List;

public class Especialidad {

    private int id;
    private String nombre;
    
    private List<Medicos> listamedicos = new ArrayList<>();

    public Especialidad(String nombre) {
        super();
        this.nombre = nombre;
    }
    
    

    public Especialidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public List<Medicos> getListamedicos() {
        return listamedicos;
    }

    public void setListamedicos(List<Medicos> listamedicos) {
        this.listamedicos = listamedicos;
    }
 
    
    public void agregarunmedico(Medicos medico){
        listamedicos.add(medico);
    }
    
    public void mostrarListaMedicos() {
        for (Medicos medico : listamedicos) {
            System.out.println(listamedicos.toString());
        }
    }
}
