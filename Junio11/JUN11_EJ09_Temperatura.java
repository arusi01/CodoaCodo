package cfp10;

import java.util.Scanner;

public class JUN11_EJ09_Temperatura {

    public static boolean salirCasa(int temperatura) {
        boolean sale = false;
        if (temperatura > 75) {
            sale = true;
        }
        return (sale);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura exterior.");
        System.out.println("");

        System.out.print("Ingrese temperatura: ");
        int temperatura = sc.nextInt();

        System.out.println("");
        if (salirCasa(temperatura)) {
            System.out.println("Se puede salir de casa.");
        } else {
            System.out.println("Nos quedamos en casa.");
        }

    }
}
