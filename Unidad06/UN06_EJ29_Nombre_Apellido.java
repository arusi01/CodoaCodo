package cfp10;

import java.util.Scanner;

public class UN06_EJ29_Nombre_Apellido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre y Apellido.");
        System.out.println("");

        String nombre = "";

        do {
            System.out.print("Ingrese su nombre y apellido: ");
            nombre = sc.nextLine();
        } while (nombre.isEmpty());

        nombre = nombre.trim(); //eliminar los posibles espacios en blanco al principio y al final
        nombre = nombre.toLowerCase();

        String resultado = nombre.substring(0, 1).toUpperCase();

        for (int i = 1; i < nombre.length(); i++) {
            if (nombre.charAt(i - 1) == ' ' && nombre.charAt(i) != ' ') {
                resultado = resultado + Character.toUpperCase(nombre.charAt(i));
            } else {
                resultado = resultado + nombre.charAt(i);
            }
        }

        System.out.println("\n" + resultado);
    }
}
