package cfp10;

import java.util.Scanner;

public class UN06_EJ10_Paises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array de Paises");
        System.out.println("");

        int posicion;
        String vector[] = {"Argentina", "Chile", "Uruguay", "Estados Unidos", "España", "Alemania", "Japon", "Australia"};

        do {
            System.out.print("Ingrese posicion a mostrar (0-7): ");
            posicion = sc.nextInt();
        } while (posicion < 0 | posicion > 7);

        System.out.println("\nEl pais de la posicion "+posicion+" es "+vector[posicion]);
        System.out.println("");
    }
}
