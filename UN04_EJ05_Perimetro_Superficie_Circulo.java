package cfp10;

import java.util.Scanner;

public class UN04_EJ05_Perimetro_Superficie_Circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del perimetro y superficie de un circulo.");
        System.out.println("");

        System.out.print("Ingrese el radio: ");
        int radio = sc.nextInt();

        double perimetro = 2 * Math.PI * radio;
        double superficie = Math.PI * radio * radio;

        System.out.println("");
        System.out.println("El perimetro es " + perimetro + " y su superficie es " + superficie);

    }
}
