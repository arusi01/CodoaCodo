package cfp10;

import java.util.Scanner;

public class UN06_EJ28_Contar_Palabras {

    public static int contarPalabras(String cadena) {

        int cantidad = 1;
        cadena = cadena.trim(); //eliminar los posibles espacios en blanco al principio y al final

        if (cadena.isEmpty()) { //si la cadena está vacía
            cantidad = 0;
        } else {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ' && cadena.charAt(i + 1) != ' ') {
                    cantidad++;
                }
            }
        }
        return (cantidad);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de palabras.");
        System.out.println("");

        System.out.print("Ingrese una frase: ");
        String cadena = sc.nextLine();

        System.out.println("\nCantidad de Palabras: " + contarPalabras(cadena));
    }
}
