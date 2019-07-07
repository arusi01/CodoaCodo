package cfp10;

import java.util.Scanner;

public class UN06_EJ02_Mitad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double mitad;

        System.out.println("Array muestra la mitad del valor");
        System.out.println("");

        System.out.print("Ingrese largo del vector: ");
        int largo = sc.nextInt();
        int vector[] = new int[largo];

        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.print("Ingrese Numero [" + (posicion + 1) + "]: ");
            vector[posicion] = sc.nextInt();
        }
        System.out.println("");
        for (int posicion = 0; posicion < vector.length; posicion++) {
            mitad=(double) (vector[posicion])/2;
            System.out.println("Nº" + (posicion + 1) + " la mitad: " + mitad);
        }
    }
}
