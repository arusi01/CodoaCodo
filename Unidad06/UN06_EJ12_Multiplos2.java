package cfp10;

import java.util.Scanner;

public class UN06_EJ12_Multiplos2 {

    public static void multiplos(int vector[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese multiplo a buscar: ");
        int M = sc.nextInt();

        for (int posicion = 0; posicion < vector.length; posicion++) {
            vector[posicion] = M * (posicion + 1);
        }
    }

    public static void mostrar(int vector[]) {
        System.out.println("\nMultiplos encontrados:");
        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.print(vector[posicion] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array de multiplos");
        System.out.println("");

        System.out.print("Ingrese largo del vector: ");
        int T = sc.nextInt();
        int vector[] = new int[T];

        multiplos(vector);
        mostrar(vector);

    }
}
