package cfp10;

import java.util.Scanner;

public class UN04_EJ08_Jubilacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Validacion para Jubilarse");
        System.out.println("");

        System.out.print("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese el genero (f/m): ");
        String genero = sc.next();
        System.out.println("");
        
        if ((genero.equalsIgnoreCase("f") && edad >= 60) || (genero.equalsIgnoreCase("m") && edad >= 65)) {
            System.out.println("SE JUBILA.");
        } else {
            System.out.println("NO SE JUBILA.");
        }
    }
}
