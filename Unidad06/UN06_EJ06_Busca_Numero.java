package cfp10;

import java.util.Scanner;

public class UN06_EJ06_Busca_Numero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array busca un numero");
        System.out.println("");

        System.out.print("Ingrese largo del vector: ");
        int largo = sc.nextInt();
        int vector[] = new int[largo];

        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.print("Ingrese Numero [" + (posicion + 1) + "]: ");
            vector[posicion] = sc.nextInt();
        }

        System.out.print("Ingrese Numero a buscar: ");
        int buscar = sc.nextInt();
        System.out.println("");

        for (int posicion = 0; posicion < vector.length; posicion++) {
            if (vector[posicion] == buscar) {
                System.out.println("Numero encontrado en posicion " + (posicion + 1));
            }
        }
    }
}