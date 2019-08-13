package AGO08_ArrayListObjeto_Metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        ArrayList<Persona> lista = new ArrayList<>();

        Persona persona = new Persona();
        persona.cargarLista(lista);

        System.out.println("\nMostrar forma 1");
        // Mostrar forma 1
        for (Persona persona1 : persona.mostrar(lista)) {
            System.out.println("Nombre: " + persona1.getNombre()
                    + " Apellido: " + persona1.getApellido()
                    + " edad: " + persona1.getEdad());
        }
        
        System.out.println("\nIngrese el nombre a eliminar: ");
        String nombre=teclado.next();
        persona.remover(lista, nombre);
        
        System.out.println("\nMostrar forma 2");
        
        // Mostrar forma 2
        List<Persona> mostrar = persona.mostrar(lista);
        for (int i = 0; i < mostrar.size(); i++) {
            Persona get = mostrar.get(i);
            System.out.println("Nombre: " + get.getNombre()
                    + " Apellido: " + get.getApellido()
                    + " edad: " + get.getEdad());
        }
    }
}
