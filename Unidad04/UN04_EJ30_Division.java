package cfp10;

import java.util.Scanner;

public class UN04_EJ30_Division {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Operacion Division.");

        float Nro1, Nro2, Resultado; //he declarado la variable de tipo real
        boolean continuar = true;

        System.out.println("");
        System.out.print("Ingrese un número: ");
        Nro1 = teclado.nextFloat();

        do {
            System.out.print("Ingrese divisor: ");
            Nro2 = teclado.nextFloat();

            if (Nro2 == 0) {
                System.out.println("");
                System.out.println("El divisor no puede ser cero. Intente nuevamente.");
                System.out.println("");
            } else {
                continuar = false;
            }
        } while (continuar);
        Resultado = (float) Nro1 / Nro2;
        System.out.println("");
        System.out.println("La division de " + Nro1 + " / " + Nro2 + " es: " + Resultado);

    }
}
