package cfp10;

import java.util.Scanner;

public class UN06_EJ08_Suma_Arreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int largo = 5;
        int vector[] = new int[largo];
        int vector1[] = new int[largo];
        int vector2[] = new int[largo];

        System.out.println("Suma de dos arreglos con un tamaño de 5");
        System.out.println("");

        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.print("Ingrese Arreglo A Numero [" + (posicion + 1) + "]: ");
            vector[posicion] = sc.nextInt();
        }
        System.out.println("");
        for (int posicion = 0; posicion < vector1.length; posicion++) {
            System.out.print("Ingrese Arreglo B Numero [" + (posicion + 1) + "]: ");
            vector1[posicion] = sc.nextInt();
        }
        System.out.println("");
        for (int posicion = 0; posicion < vector.length; posicion++) {
            vector2[posicion] = vector[posicion] + vector1[posicion];
            System.out.println("La suma de los arreglos A+B [" + (posicion + 1) + "]: " + vector2[posicion]);
        }
    }
}
