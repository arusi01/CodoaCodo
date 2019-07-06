package cfp10;

import java.util.Scanner;

public class UN05_EJ05_cantidadDeDivisores {

    public static int cantidadDeDivisores(int nro1) {
        int contador=0;
        for (int i=nro1;i>0;i--) {
            if (nro1 % i==0){
                contador++;
            }
        }
        return (contador);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculo de Cantidad de Divisores");
        System.out.print("\nIngrese un número: ");
        int nro1 = teclado.nextInt();

        System.out.println("Cantidad de Divisores: " + cantidadDeDivisores(nro1));

    }
}
