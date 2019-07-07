package cfp10;

import java.util.Scanner;

public class UN06_EJ20_Cadena_en_mayúsculas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadena enteramente en mayúsculas");
        System.out.println("");

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.next();
        
        System.out.println("\n"+cadena.toUpperCase());
    }
}
