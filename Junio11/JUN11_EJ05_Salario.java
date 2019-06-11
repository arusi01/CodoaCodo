package cfp10;

import java.util.Scanner;

public class JUN11_EJ05_Salario {

    public static double Salario(float valor, int hora) {
        float bruto = valor * hora;
        double neto = bruto * 0.9;
        return (neto);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sueldo empleado.");
        System.out.println("");

        System.out.print("Nombre empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cantidad horas trabajadas: ");
        int hora = sc.nextInt();

        System.out.print("Valor hora: ");
        float valor = sc.nextFloat();

        System.out.printf("%nEl salario neto de %s es $ %.2f%n", nombre, Salario(valor, hora));
    }
}
