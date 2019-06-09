package cfp10;

import java.util.Scanner;

public class UN04_EJ22_Escalera_While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int filas = 5;

        System.out.println("Escalera de asteriscos con while.");
        System.out.println("");

        int cont1 = 1;
        while (cont1 <= filas) {
            int cont2 = 1;
            while (cont2 <= filas) {
                if (cont1 >= cont2) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
                cont2++;
            }
            cont1++;
            System.out.println("");
        }
    }
}
