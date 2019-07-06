package cfp10;

import java.util.Scanner;

public class UN05_EJ02_Suma_Resta {
    
    public static double suma(double nro1, double nro2) {
        double resultado=nro1+nro2;
        return resultado;
    }
    
    public static double resta(double nro1, double nro2) {
        double resultado=nro1-nro2;
        return resultado;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Double nro1, nro2, resultado;
        String tipo;

        System.out.println("SUMA o RESTA:");
        System.out.print("\nIngrese el número 1: ");
        nro1 = teclado.nextDouble();

        System.out.print("Ingrese el número 2: ");
        nro2 = teclado.nextDouble();
        
        String operacion = "";
        do {
            System.out.print("Desea sumarlos o restarlos (S / R): ");
            operacion = teclado.next();
        } while (!operacion.equalsIgnoreCase("s") && !operacion.equalsIgnoreCase("r"));
        
        if (operacion.equalsIgnoreCase("s")) {
            resultado=suma(nro1,nro2);
            tipo="suma";
        }else{
            resultado=resta(nro1,nro2);
            tipo="resta";
        }
        System.out.println("\nEl resultado de la operacion "+tipo+" es "+resultado);
        
    }
}
