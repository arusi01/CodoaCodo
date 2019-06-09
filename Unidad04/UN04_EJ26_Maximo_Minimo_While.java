package cfp10;

import java.util.Scanner;

public class UN04_EJ26_Maximo_Minimo_While {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nro=1, nromayor = 0, nromenor = 0, contador = 0;
        double promedio = 0;

        System.out.println("Valor Maximo, Minimo y Promedio.");
        System.out.println("");

        while (nro != 0) {
            contador++;
            System.out.print("Ingrese nro #" + contador + " (0 para finalizar): ");
            nro = teclado.nextInt();
            if (contador == 1) {
                nromayor = nro;
                nromenor = nro;
                promedio = nro;
            } else {
                promedio = promedio + nro;
                if (nro > nromayor) {
                    nromayor = nro;
                } else {
                    if (nro < nromenor && nro != 0) {
                        nromenor = nro;
                    }
                }
            }
        }
        promedio=promedio/(contador-1);
        System.out.println("");
        System.out.println("El número mayor ingresado es = " + nromayor);
        System.out.println("El número menor ingresado es = " + nromenor);
        System.out.println("El promedio es = " + promedio);
    }
}
