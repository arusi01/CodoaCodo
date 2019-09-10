package SEP05_Agenda;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Persona> personas = new ArrayList<>();

    public Agenda() {
    }
    
    public void agregarPersonas(int codigo,String nombre){
        Persona per = new Persona(codigo,nombre); 
        personas.add(per);
    }
    
    public void mostrarPersonas(){
        for (Persona per : personas) {
            System.out.println(per.getNombre());
        }
    }
    
    public void eliminarPersona(int codigo){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCodigo()==codigo) {
                personas.remove(i);
            }
        }
    }
    
    public void buscarPersona(int codigo){
        boolean encontrado=false;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCodigo()==codigo) {
                System.out.println("Persona Encontrada");
                encontrado=true;
            }
        }
        if (!encontrado) {
                System.out.println("Persona NO Encontrada");           
        }
    }  
}
