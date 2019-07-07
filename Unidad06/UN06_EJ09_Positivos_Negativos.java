package cfp10;

import java.util.Scanner;

public class UN06_EJ09_Positivos_Negativos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Array muestra cantidad de positivos o negativos");
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
            if (vector[posicion] > 0) {
                positivos++;
            } else {
                if (vector[posicion] < 0) {
                    negativos++;
                }
            }
        }
        System.out.println("La cantidad de numeros positivos encontrados es " + positivos);
        System.out.println("La cantidad de numeros negativos encontrados es " + negativos);
    }
}