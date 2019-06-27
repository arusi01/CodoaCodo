package cfp10;

import java.util.Scanner;

public class JUN18_Matriz_Multipl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int filas;
        do {
            System.out.print("Ingrese total de filas de la matriz: ");
            filas = sc.nextInt();
        } while (filas < 1);

        int columnas;
        do {
            System.out.print("Ingrese total de columnas de la matriz: ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        int matriz[][] = new int[filas][columnas];

        System.out.println("\nIngrese los elementos de la Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posicion " + i + "," + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz Ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nMultiplicacion de la diagonal:");
        int resultado = matriz[0][0];
        for (int i = 0; i < filas; i++) {
            if (i == 0) {
                System.out.print(matriz[i][i]);
            } else {
                resultado = resultado * matriz[i][i];
                System.out.print(" * " + matriz[i][i]);
            }
        }
        System.out.println(" = " + resultado);
    }
}
