package cfp10;

import java.util.Scanner;

public class UN04_EJ21_Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nro, resultado = 1;

        System.out.println("Calculo del factorial.");
        System.out.println("");

        do {
            System.out.print("Ingrese el numero: ");
            nro = sc.nextInt();
            if (nro < 1) {
                System.out.println("El numero ingresado debe ser mayor a 0. Ingrese nuevamente");
            }
        } while (nro < 1);

        for (int i = nro; i > 0; i--) {
            resultado = resultado*i;
        }
        System.out.println("");
        System.out.println("El factorial de " + nro + " es: " + resultado);
    }
}
