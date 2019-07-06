package cfp10;

import java.util.Scanner;

public class UN05_EJ04_Cubo {

    public static int cubo(int nro1) {
        return (nro1 * nro1 * nro1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("CUBO");
        System.out.print("\nIngrese un número: ");
        int nro1 = teclado.nextInt();

        System.out.println("El cubo del numero " + nro1 + " es " + cubo(nro1));

    }
}
