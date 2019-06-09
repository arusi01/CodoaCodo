package cfp10;

import java.util.Scanner;

public class UN04_EJ14_Numeracion_Romano {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de numeración romano.");
        System.out.println("");

        int nro = 0;

        do {
            System.out.print("Ingrese una letra : ");
            String romano = sc.next().toUpperCase();

            switch (romano) {
                case "I":
                    nro = 1;
                    break;
                case "V":
                    nro = 5;
                    break;
                case "X":
                    nro = 10;
                    break;
                case "L":
                    nro = 50;
                    break;
                case "C":
                    nro = 100;
                    break;
                case "D":
                    nro = 500;
                    break;
                case "M":
                    nro = 1000;
                    break;
                default:
                    System.out.println("La letra ingresada no es un numero romano. Ingrese nuevamente.");
                    break;
            }
        } while (nro == 0);
        System.out.println("");
        System.out.println("Numero romano " + nro);
    }
}
