package cfp10;

import java.util.Scanner;

public class UN06_EJ27_Usuario_Vocales_Consonantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de Usuario cantidad de vocales y consonantes.");
        System.out.println("");

        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.toLowerCase().charAt(i) == 'a') || (nombre.toLowerCase().charAt(i) == 'e')
                    || (nombre.toLowerCase().charAt(i) == 'i') || (nombre.toLowerCase().charAt(i) == 'o')
                    || (nombre.toLowerCase().charAt(i) == 'u')) {
                vocales++;
            } else {
                if ((nombre.toLowerCase().charAt(i) == 'b') || (nombre.toLowerCase().charAt(i) == 'c')
                        || (nombre.toLowerCase().charAt(i) == 'd') || (nombre.toLowerCase().charAt(i) == 'f')
                        || (nombre.toLowerCase().charAt(i) == 'g') || (nombre.toLowerCase().charAt(i) == 'h')
                        || (nombre.toLowerCase().charAt(i) == 'j') || (nombre.toLowerCase().charAt(i) == 'k')
                        || (nombre.toLowerCase().charAt(i) == 'l') || (nombre.toLowerCase().charAt(i) == 'm')
                        || (nombre.toLowerCase().charAt(i) == 'n') || (nombre.toLowerCase().charAt(i) == 'ñ')
                        || (nombre.toLowerCase().charAt(i) == 'p') || (nombre.toLowerCase().charAt(i) == 'q')
                        || (nombre.toLowerCase().charAt(i) == 'r') || (nombre.toLowerCase().charAt(i) == 's')
                        || (nombre.toLowerCase().charAt(i) == 't') || (nombre.toLowerCase().charAt(i) == 'v')
                        || (nombre.toLowerCase().charAt(i) == 'w') || (nombre.toLowerCase().charAt(i) == 'x')
                        || (nombre.toLowerCase().charAt(i) == 'y') || (nombre.toLowerCase().charAt(i) == 'z')) {
                    consonantes++;
                }
            }
        }
        System.out.println("\n" + nombre + " tiene " + vocales + " vocales y " + consonantes + " consonantes.");
    }
}
