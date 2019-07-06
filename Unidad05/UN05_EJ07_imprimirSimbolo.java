package cfp10;

import java.util.Scanner;

public class UN05_EJ07_imprimirSimbolo {

    public static void imprimirSimbolo(int cantidad, char simbolo) {
        System.out.println("");
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(simbolo);
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Imprimir Simbolo");

        System.out.print("\nIngrese cantidad de veces a repetir: ");
        int cantidad = teclado.nextInt();

        System.out.print("Ingrese un caracter: ");
        char simbolo = teclado.next().charAt(0);

        imprimirSimbolo(cantidad, simbolo);
    }
}
