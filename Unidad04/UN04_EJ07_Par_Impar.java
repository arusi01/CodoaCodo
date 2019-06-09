package cfp10;

import java.util.Scanner;

public class UN04_EJ07_Par_Impar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("El numero es par o impar?");
        System.out.println("");

        System.out.print("Ingrese el numero: ");
        int numero = sc.nextInt();
        System.out.println("");
        System.out.print("El numero ingresado es ");
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }

}
