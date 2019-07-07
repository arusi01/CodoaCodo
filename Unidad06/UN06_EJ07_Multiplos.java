package cfp10;

import java.util.Scanner;

public class UN06_EJ07_Multiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array de multiplos");
        System.out.println("");

        System.out.print("Ingrese largo del vector: ");
        int T = sc.nextInt();
        int vector[] = new int[T];

        System.out.print("Ingrese multiplo a buscar: ");
        int M = sc.nextInt();
        
        for (int posicion = 0; posicion < vector.length; posicion++) {
            vector[posicion] = M*posicion;
        }

        System.out.println("\nMultiplos encontrados:");        
        for (int posicion=0; posicion < vector.length; posicion++) {
        System.out.print(vector[posicion]+" ");
        }
        System.out.println("");
    }        
}
