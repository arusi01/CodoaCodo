package cfp10;

import java.util.Scanner;

public class UN04_EJ23_Maximo_Minimo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nro, nromayor = 0, nromenor = 0, contador = 0;

        System.out.println("Valor Mayor y menor.");
        System.out.println("");

        do {
            contador++;
            System.out.print("Ingrese nro #" + contador + " (0 para finalizar): ");
            nro = teclado.nextInt();
            if (contador == 1) {
                nromayor = nro;
                nromenor = nro;
            } else {
                if (nro > nromayor) {
                    nromayor = nro;
                } else {
                    if (nro < nromenor && nro != 0) {
                        nromenor = nro;
                    }
                }
            }
        } while (nro != 0);
        System.out.println("");
        System.out.println("El número mayor ingresado es = " + nromayor);
        System.out.println("El número menor ingresado es = " + nromenor);
    }
}
