package cfp10;

import java.util.Scanner;

public class UN04_EJ25_Clave_Acceso {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        String clave, acceso = "eureka";
        boolean error = true;

        System.out.println("Clave de acceso.");
        System.out.println("");

        while (error) {
            contador++;
            System.out.print("Ingrese su clave: ");
            clave = teclado.next();
            if (contador == 3) {
                System.out.println("Intentos agotados. Bye.");
                error = false;
            } else {
                if (clave.equals(acceso)) {
                    error = false;
                } else {
                    System.out.println("La clave ingresada es incorrecta. Intente nuevamente.");
                }
            }
        }
    }
}
