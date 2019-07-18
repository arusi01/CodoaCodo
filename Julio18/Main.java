package JUN18_ArrayList_Teclado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de datos: ");
        int largo =teclado.nextInt();
        
        for (int i = 0; i < largo; i++) {
            System.out.print("Posicion N° ["+i+"]: ");
            int num=teclado.nextInt();
            lista.add(num);
        }
        
        System.out.println("\nLargo de la lista: " + lista.size() + "\n");        
        System.out.println("N°: "+lista);
        
    }

}
