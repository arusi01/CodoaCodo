package cfp10;

import java.util.Scanner;

public class UN06_EJ24_Capicua {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Número Capicua.");
        System.out.println("");

        int nro = 0;

        do {
            System.out.print("Ingrese un número de 2 a 4 cifras: ");
            nro = sc.nextInt();
        } while (nro < 10 | nro > 9999);

        int falta = nro;
        int numeroInvertido = 0;
        int resto = 0;

        while (falta != 0) {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }
        if (numeroInvertido == nro) {
            System.out.println("\nEl numero ES capicua\n");
        } else {
            System.out.println("\nEl numero NO es capicua\n");
        }
    }

}
