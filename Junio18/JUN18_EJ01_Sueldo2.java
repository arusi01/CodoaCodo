package cfp10;

import java.util.Scanner;

public class JUN18_EJ01_Sueldo2 {
        public static double Salario(float sueldo) {
        double neto;
        if (sueldo < 25000) {
            neto = (double) (sueldo - (sueldo * 0.1));
        }else{
            neto=sueldo;
        }
        return (neto);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sueldo empleado.");
        System.out.println("");

        System.out.print("Nombre empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese Sueldo: ");
        float sueldo = sc.nextFloat();

        System.out.printf("%nEl salario neto de %s es $ %.2f%n", nombre, Salario(sueldo));
    }
}
