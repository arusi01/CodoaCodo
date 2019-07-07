package cfp10;

import java.util.Scanner;

public class UN06_EJ15_Clientes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array de Clientes");
        System.out.println("");

        int posicion=0;
        boolean encontrado=false;
        
        String vector[] = {"Carlos", "Alberto", "Karina", "Pablo", "Alejandra"};

        System.out.print("Ingrese nombre del cliente a buscar: ");
        String cliente = sc.next();

        for (String nombre : vector) {
            if (nombre.equalsIgnoreCase(cliente)) {
                System.out.println("\nEl cliente " + cliente + " fue encontrado en la posicion " + posicion);
                encontrado=true;
            }
            posicion++;
        }
        if (!encontrado){
            System.out.println("\nEl cliente no fue encontrado.");
        }
    }
}
