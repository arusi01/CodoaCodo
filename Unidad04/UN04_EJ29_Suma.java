package cfp10;

import java.util.Scanner;

public class UN04_EJ29_Suma {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Suma de pares de numeros.");

        float Nro1, Nro2, Resultado; //he declarado la variable de tipo real
        boolean continuar=true;

        do {
            System.out.println("");
            System.out.print("Ingrese el primer numero (0 para finalizar): ");
            Nro1 = teclado.nextFloat();

            System.out.print("Ingrese el segundo numero (0 para finalizar): ");
            Nro2 = teclado.nextFloat();

            if (Nro1 == 0 && Nro2 == 0) {
                continuar=false;
            }else{
                Resultado = (float) Nro1 + Nro2;
                System.out.println("");
                System.out.println("La suma de " + Nro1 + " + " + Nro2 + " es: " + Resultado);
            }
        } while (continuar);
    }
}
