package cfp10;

import java.util.Scanner;

public class JUN18_EJ01_Sueldo {
       public static void Salario(String nombre, float sueldo) {
        if (sueldo<25000) {
            sueldo=(float) (sueldo-(sueldo*0.1));
        }   
        System.out.printf("%nEl salario neto de %s es $ %.2f%n", nombre, sueldo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sueldo empleado.");
        System.out.println("");

        System.out.print("Nombre empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese Sueldo: ");
        float sueldo = sc.nextFloat();

        Salario(nombre,sueldo);
    }
}
