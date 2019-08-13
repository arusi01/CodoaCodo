package AGO08_ArrayListObjeto_Metodos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        Persona persona = new Persona();
        persona.cargarLista(lista);
        
//        System.out.println("la Lista: "+persona.mostrar(lista));

        for (Persona persona1 : persona.mostrar(lista)) {
            System.out.println("Nombre: "+persona1.getNombre()
                    +" Apellido: "+persona1.getApellido()
                    +" edad: "+persona1.getEdad());
        }
    }
}
