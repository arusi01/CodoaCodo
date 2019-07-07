package cfp10;

import java.util.Scanner;

public class UN06_EJ03_al_reves {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array muestra al reves");
        System.out.println("");

        System.out.print("Ingrese largo del vector: ");
        int largo = sc.nextInt();
        char vector[] = new char[largo];

        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.print("Ingrese caracter [" + (posicion + 1) + "]: ");
            vector[posicion] = sc.next().charAt(0);
        }
        System.out.println("");
        for (int posicion = (vector.length-1); posicion >= 0; posicion--) {
            System.out.print(vector[posicion]);
        }
        System.out.println("");
    }
}
