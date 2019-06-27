package cfp10;

import java.util.Scanner;

public class JUN25_Recibo_Sueldo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double neto;
        float impuesto;
        
        System.out.println("Sueldo.");
        System.out.println("Ingrese los datos del empleado: ");
        System.out.print("\nNumero: ");
        int numero = sc.nextInt();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Puesto: ");
        String puesto = sc.next();

        switch (puesto.toLowerCase()) {
            case "ingeniero":
                neto=6800;
                impuesto=10;
                break;
            case "tecnico":
                neto=4246;
                impuesto=10;
                break;
            default:
                neto=2500;
                impuesto=10;
        }
        double descuento=neto*impuesto/100;
        double bruto=neto-descuento;
        
        System.out.println("\nRECIBO DE SUELDO: ");
        System.out.println("\nNumero de empleado: "+numero);
        System.out.println("Nombre del empleado: "+nombre); 
        System.out.println("Puesto: "+puesto);
        System.out.println("Sueldo Neto: "+neto);
        System.out.println("Impuesto: "+descuento);
        System.out.println("\nTOTAL: "+bruto);        
    }
}
