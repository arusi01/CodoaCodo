package cfp10;

import java.util.Scanner;

public class UN04_EJ16_10_Numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nro;

        System.out.println("Mostrar diez números siguientes.");
        System.out.println("");

        System.out.print("Ingrese un numero: ");
        nro = sc.nextInt();
       
        //for
        System.out.println("");
        for (int i = 1; i < 11; i++) {
            System.out.print((nro + i) + " ");
        }
        
        //while
        System.out.println("");
        int i = 1;
        while (i < 11) {
            System.out.print((nro + i) + " ");
            i++;
        }

        //do..while
        System.out.println("");
        i = 1;
        do {
            System.out.print((nro + i) + " ");
            i++;
        } while (i < 11);

    }
}
