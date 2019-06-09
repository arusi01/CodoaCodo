package cfp10;

import java.util.Scanner;

public class JUN04_EJ04_Menor_Tres {

    public static double Menor(Double nro1, Double nro2, Double nro3) {
        double nromenor = 0;
        if (nro1 < nro2 && nro1 < nro3) {
            nromenor = nro1;
        } else {
            if (nro2 < nro3) {
                nromenor = nro2;
            } else {
                nromenor = nro3;
            }
        }
        return nromenor;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Double nro1, nro2, nro3;

        System.out.print("Ingrese el número 1: ");
        nro1 = teclado.nextDouble();

        System.out.print("Ingrese el número 2: ");
        nro2 = teclado.nextDouble();

        System.out.print("Ingrese el número 3: ");
        nro3 = teclado.nextDouble();

        System.out.println("El número menor de los tres es: " + Menor(nro1, nro2, nro3));
    }
}
