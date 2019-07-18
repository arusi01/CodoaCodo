package JUN18_ArrayList_Teclado_Nombres;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       ArrayList<String> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de datos: ");
        int largo =teclado.nextInt();
        
        for (int i = 0; i < largo; i++) {
            System.out.print("Posicion Nombre ["+i+"]: ");
            String nombre=teclado.next();
            lista.add(nombre);
        }
        
        System.out.println("\nLargo de la lista: " + lista.size() + "\n");        
        System.out.println("Nombres: "+lista);
        
    }    
}
