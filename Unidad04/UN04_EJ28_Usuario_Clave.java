package cfp10;

import java.util.Scanner;

public class UN04_EJ28_Usuario_Clave {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String usuario, clave;
        boolean error = true;

        System.out.println("Control de Acceso");
        do {
            System.out.println("");
            System.out.print("Ingrese usuario: ");
            usuario = teclado.next();
            System.out.print("Ingrese clave: ");
            clave = teclado.next();
            System.out.println("");
            if (usuario.equals("admin") && clave.equals("1234")) {
                System.out.println("Acceso Permitido");
                error = false;
            } else {
                System.out.println("Acceso Denegado");
            }
        } while (error);
    }
}
