package cfp10;

import java.util.Scanner;

public class JUN25_Recibo_Sueldo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Recibo de Sueldo");
        System.out.println("Ingrese los datos del empleado: ");
        System.out.print("\nNumero: ");
        int numero = sc.nextInt();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Puesto: ");
        String puesto = sc.next();
        System.out.print("Sueldo Neto: ");
        double neto = sc.nextDouble();
        System.out.print("Impuesto %: ");
        double impuesto = sc.nextDouble();


        
    }
}
