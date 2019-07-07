package cfp10;

import java.util.Scanner;

public class UN06_EJ22_Oracion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Mostrar cadena en formato oración.");
        System.out.println("");

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        
        cadena=cadena.toLowerCase();
        cadena=cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
        if (cadena.charAt(cadena.length() - 1)!='.'){
            cadena=cadena+".";
        }
        
        System.out.println("\n" + cadena);
    }
}
