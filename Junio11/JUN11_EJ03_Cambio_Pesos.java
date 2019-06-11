package cfp10;

import java.util.Scanner;

public class JUN11_EJ03_Cambio_Pesos {

    public static double compraDol(double pesos, float cotizacion) {
        double dolares = (double) (pesos/cotizacion);
        return (dolares);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Compra de Dolares.");
        System.out.println("");

        System.out.print("Ingrese la cantidad de pesos a vender: ");
        double pesos = sc.nextDouble();
        
        System.out.print("Ingrese la cotizacion: ");
        float cotizacion = sc.nextFloat();

        System.out.println("");
        System.out.printf("Total en Dolares U$S %.2f", compraDol(pesos,cotizacion));
        System.out.println("");
    }
}
