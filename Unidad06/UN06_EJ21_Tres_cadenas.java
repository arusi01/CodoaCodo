package cfp10;

import java.util.Scanner;

public class UN06_EJ21_Tres_cadenas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tres Cadenas");

        System.out.print("Ingrese una cadena 1: ");
        String cadena = sc.next();
        System.out.print("Ingrese una cadena 2: ");
        String cadena1 = sc.next();
        System.out.print("Ingrese una cadena 3: ");
        String cadena2 = sc.next();

        String inverso = cadena2 + " " + cadena1 + " " + cadena;

        System.out.println("\n" + inverso + " con logitud " + inverso.length());
    }
}
