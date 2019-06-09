package cfp10;

import java.util.Scanner;

public class JUN04_EJ05_Altura_Edad {
    
    public static void imprDatos(double altura[], int edad[]) {
        System.out.println("");
        for (int i = 0; i < altura.length; i++) {
            System.out.println("El alumno #" + (i + 1) + " de edad " + edad[i] + " mide " + altura[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int largovector = 5;
        double altura[] = new double[largovector];
        int edad[] = new int[largovector];

        for (int i = 0; i < largovector; i++) {
            System.out.println("");
            System.out.println("Almuno #" + (i + 1));
            System.out.print("Ingrese altura: ");
            altura[i] = sc.nextDouble();
            System.out.print("Ingrese edad: ");
            edad[i] = sc.nextInt();
        }
        imprDatos(altura, edad);
    }

}
