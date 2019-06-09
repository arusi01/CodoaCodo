package cfp10;

import java.util.Scanner;

public class UN04_EJ06_Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del perimetro y superficie de un triangulo rectangulo.");
        System.out.println("");

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();

        System.out.print("Ingrese la altura: ");
        int altura = sc.nextInt();
        
        double perimetro= altura+base+Math.hypot(base, altura);
        double superficie = (double) (base*altura)/2;

        System.out.println("");
        System.out.println("El perimetro es " + perimetro + " y su superficie es " + superficie);
    }
}
