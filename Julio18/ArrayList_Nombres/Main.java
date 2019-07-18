package JUN18_ArrayList_Nombres;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();  // Dinamico

        lista.add("Alberto");
        lista.add("Carlos");
        lista.add("Pepe");

        System.out.println("Largo de la lista: " + lista.size() + "\n");

        for (int i = 0; i < lista.size(); i++) {
            String datos = lista.get(i);
                 // Variable de referencia
            System.out.println("Nombre: " + datos);
            
            if (lista.get(i).equals("Carlos")) {
                System.out.println("Carlos Encontrado en posicion: "+i);
            }
        }
    }
}
