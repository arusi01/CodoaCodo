package cfp10;

import java.util.Scanner;

public class UN06_EJ17_Matriz_suma_columna {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int suma=0;

        System.out.println("Suma columna 1 de la matriz.");
        System.out.print("\nIngrese cantidad de Filas de la matriz a crear: ");
        int Fila = sc.nextInt();
        System.out.print("Ingrese cantidad de Columnas de la matriz a crear: ");
        int Columna = sc.nextInt();

        int matriz[][] = new int[Fila][Columna];

        System.out.println("\nIngreso de datos por teclado: ");
        for (int f = 0; f < Fila; f++) {
            for (int c = 0; c < Columna; c++) {
                System.out.print("Ingrese valor Fila " + (f+1) + " Columna " + (c+1) + ": ");
                matriz[f][c] = sc.nextInt();
            }
        }

        for (int f = 0; f < Fila; f++) {
            suma=suma+matriz[f][0];
        }
        System.out.println("\nEl resultado de la suma de la columna 1 es: "+suma);
    }
}
