package cfp10;

import java.util.Scanner;

public class JUN04_EJ03_Mayor_Tres {

    public static double Mayor(Double nro1, Double nro2, Double nro3) {
        double nromayor = 0;
        if (nro1 > nro2 && nro1 > nro3) {
            nromayor = nro1;
        } else {
            if (nro2 > nro3) {
                nromayor = nro2;
            } else {
                nromayor = nro3;
            }
        }
        return nromayor;
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

        System.out.println("El número mayor de los tres es: " + Mayor(nro1, nro2, nro3));
    }
}
