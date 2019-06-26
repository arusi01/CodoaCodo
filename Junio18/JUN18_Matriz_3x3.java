package cfp10;

import java.util.Scanner;

public class JUN18_Matriz_3x3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese Filas Matriz: ");
        int Fila = sc.nextInt();
        System.out.print("Ingrese Columnas Matriz: ");
        int Columna = sc.nextInt();

        int matriz[][] = new int[Fila][Columna];

        for (int f = 0; f < Fila; f++) {
            for (int c = 0; c < Columna; c++) {
                System.out.print("Ingrese valor Fila " + f + " Columna " + c + ": ");
                matriz[f][c] = sc.nextInt();
            }
        }
        
        for (int f = 0; f < Fila; f++) {
            for (int c = 0; c < Columna; c++) {
                System.out.println("Valor Fila " + f + " Columna " + c + ": "+matriz[f][c]);
            }
        }
    }
}
