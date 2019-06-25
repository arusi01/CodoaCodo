package cfp10;

import java.util.Scanner;

public class JUN25_metodo_cramer {

    public static void cramer(int matriz[][], int resultado[]) {
        int Dt, Dx, Dy, x, y;
        Dt = (matriz[0][0] * (matriz[1][1])) - (matriz[1][0] * (matriz[0][1]));
        Dx = (resultado[0] * (matriz[1][1])) - (resultado[1] * (matriz[0][1]));
        Dy = (matriz[0][0] * (resultado[1])) - (matriz[1][0] * (resultado[0]));
        x = Dx / Dt;
        y = Dy / Dt;
        
        System.out.println("Determinante: " + Dt);
        System.out.println("Dx: " + Dx);
        System.out.println("Dy: " + Dy);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[2][2];
        int resultado[] = new int[2];

        System.out.println("Ingrese los elementos de la Matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Posicion " + (i + 1) + "," + (j + 1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
            System.out.print("Resultado " + (i + 1) + ": ");
            resultado[i] = sc.nextInt();
        }
        System.out.println("\nMatriz Ingresada:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.print(" = " + resultado[i]);
            System.out.println();
        }

        System.out.println("");

        cramer(matriz,resultado);
    }
}
