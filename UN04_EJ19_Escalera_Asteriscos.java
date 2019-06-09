package cfp10;

import java.util.Scanner;

public class UN04_EJ19_Escalera_Asteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int filas;

        System.out.println("Escalera de asteriscos.");
        System.out.println("");

        System.out.print("Ingrese cantidad de filas: ");
        filas = sc.nextInt();

        for (int cont1 = 1; cont1 <= filas; cont1++) {
            for (int cont2 = 1; cont2 <= filas; cont2++) {
                if (cont1 <= cont2) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}
