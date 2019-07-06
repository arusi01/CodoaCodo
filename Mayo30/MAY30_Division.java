package cfp10;

import java.util.Scanner;

public class MAY30_Division {

    public static void division() {
        Scanner sc = new Scanner(System.in);
        int cant2 = 0;

        System.out.print("Ingrese cantidad uno: ");
        int cant1 = sc.nextInt();
        while (cant2 == 0) {
            System.out.print("Ingrese cantidad dos: ");
            cant2 = sc.nextInt();
            if (cant2 == 0) {
                System.out.println("El dividendo no puede ser cero");
            }
        }

        double resultado = (double) cant1 / (double) cant2;

        System.out.println("El resultado de la division es: " + resultado);

    }

    public static double division1(int cant1, int cant2) {
        double resultado = cant1 / cant2;
        return resultado;
    }

    public static void main(String[] args) {
        division();
        Scanner sc = new Scanner(System.in);

        int cant2 = 0;

        System.out.print("Ingrese cantidad uno: ");
        int cant1 = sc.nextInt();
        while (cant2 == 0) {
            System.out.print("Ingrese cantidad dos: ");
            cant2 = sc.nextInt();
            if (cant2 == 0) {
                System.out.println("El dividendo no puede ser cero");
            }
        }

        double resultado = division1(cant1, cant2);

        System.out.println("El resultado de la division es: " + resultado);
    }
}
