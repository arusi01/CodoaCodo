package cfp10;

import java.util.Scanner;

public class UN06_EJ26_Usuario_al_reves {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de Usuario al reves.");
        System.out.println("");

        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = sc.nextLine();

        String invertido = "";

        for (int i = nombre.length() - 1; i >= 0; i--) {
            invertido = invertido + nombre.charAt(i);
        }

        System.out.println("\n" + invertido);
    }
}
