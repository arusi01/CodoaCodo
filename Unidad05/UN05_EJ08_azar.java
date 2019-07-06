package cfp10;

import java.util.Scanner;

public class UN05_EJ08_azar {

    public static int azar(int nro) {
        return ((int) Math.floor((Math.random() * (nro+1))));
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Numeros al Azar");

        System.out.print("\nIngrese hasta numero: ");
        int nro = teclado.nextInt();

        System.out.println("\nNumero al azar entre 0-" + nro + " = " + azar(nro));
    }
}
