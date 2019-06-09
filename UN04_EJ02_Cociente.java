package cfp10;

import java.util.Scanner;

public class UN04_EJ02_Cociente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del cociente y resto de dos enteros.");
        System.out.println("");

        System.out.print("Ingrese el nro1: ");
        int nro1 = sc.nextInt();

        System.out.print("Ingrese el nro2: ");
        int nro2 = sc.nextInt();
        
        int cociente = nro1/nro2;
        int resto = nro1%nro2;
        
        System.out.println("");
        System.out.println("El resultado del cociente entero es: "+cociente);
        System.out.println("El resultado del resto entero es: "+resto);

    }
}
