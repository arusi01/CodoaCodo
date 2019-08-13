package AGO08_ArrayListObjeto_Metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor vacio por defecto
    public Persona() {
    }

    // Constructor con Parametros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public static void cargarLista(List<Persona> persona) {

        for (int i = 0; i < 2; i++) {

            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingrese su nombre: ");
            String nombre = teclado.next();
            System.out.print("Ingrese su apellido: ");
            String apellido = teclado.next();
            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            Persona pers = new Persona(nombre, apellido, edad);

            //agregamos a la lista
            persona.add(pers);
        }
    }
    
    public List<Persona> mostrar(List<Persona> persona) {
          return persona;
    }
    
                                              // nombre lista
    public List<Persona> remover(List<Persona> persona, String nombre) {
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getNombre().equals(nombre)) {
                persona.remove(i);
            }
        }
        return persona;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
