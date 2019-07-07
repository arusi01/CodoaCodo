package cfp10;

import java.util.Scanner;

public class UN06_EJ30_Burbuja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double mitad;

        System.out.println("Metodo Burbuja de 5 números.");
        System.out.println("");

        int largo = 5;
        int aux = 0;
        int vector[] = new int[largo];

        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.print("Ingrese Número " + (posicion + 1) + ": ");
            vector[posicion] = sc.nextInt();
        }

        for (int pasada = 0; pasada < vector.length - 1; pasada++) {
            for (int posicion = pasada; posicion < vector.length - 1; posicion++) {
                for (int posicion2 = 0; posicion2 < vector.length - posicion - 1; posicion2++) {
                    if (vector[posicion2] > vector[posicion2 + 1]) {
                        aux = vector[posicion2];
                        vector[posicion2] = vector[posicion2 + 1];
                        vector[posicion2 + 1] = aux;
                    }
                }
            }
        }
        
        System.out.println("\nVector Ordenado:");
        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.println("Nro " + (posicion+1) + ": " + vector[posicion]);
        }

    }
}
