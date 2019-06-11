package cfp10;

import java.util.Scanner;

public class JUN11_EJ02_Triangulo {

    public static void areaTriangulo(double base, double altura) {
        double superficie = (double) (base * altura) / 2;
        System.out.println("");
        System.out.println("La superficie es " + superficie);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del area de un triangulo.");
        System.out.println("");

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        areaTriangulo(base, altura);
    }
}
