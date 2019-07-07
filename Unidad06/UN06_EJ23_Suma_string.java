package cfp10;

import java.util.Scanner;

public class UN06_EJ23_Suma_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Suma de cadena de números.");
        System.out.println("");

        System.out.print("Ingrese una cadena de números: ");
        String cadena = sc.nextLine();
        
        int suma=0;
        
        for (int i=0;i<cadena.length();i++){
            suma=suma+Integer.parseInt(cadena.substring(i, i+1));
        }

        System.out.println("\nEl resultado de la suma de la cadena de números es: "+suma);
    }
}
