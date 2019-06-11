package cfp10;

import java.util.Scanner;

public class JUN11_EJ01_Area_Circulo {
    
    public static double Area(double radio, double pi) {
        double area = pi * (radio * radio);
        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del area de un circulo.");
        System.out.println("");

        System.out.print("Ingrese el radio: ");
        int radio = sc.nextInt();

        System.out.println("");
        System.out.println("El area es: " + Area(radio, Math.PI));

    }
}
