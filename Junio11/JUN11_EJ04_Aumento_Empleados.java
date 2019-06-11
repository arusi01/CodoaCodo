package cfp10;

import java.util.Scanner;

public class JUN11_EJ04_Aumento_Empleados {

    public static double aumentoSueldo(double salario) {
        double sueldo = salario*1.25;
        return (sueldo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aumento Sueldo.");
        System.out.println("");

        System.out.print("Ingrese el sueldo empleado: ");
        double sueldo = sc.nextDouble();

        System.out.printf("%nEl nuevo salario es: %.2f%n", aumentoSueldo(sueldo));
    }
}
