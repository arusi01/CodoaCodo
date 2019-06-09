package cfp10;

import java.util.Scanner;

public class UN04_EJ04_Perimetro_Circulo {

    public static void main(String[] args) {

        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del perimetro de un circulo.");
        System.out.println("");

        System.out.print("Ingrese el diametro: ");
        int diametro = sc.nextInt();

        int perimetro = (int) (pi * diametro);

        System.out.println("");
        System.out.println("El perimetro es: " + perimetro);

    }
}
