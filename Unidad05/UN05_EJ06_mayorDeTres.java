package cfp10;

import java.util.Scanner;

public class UN05_EJ06_mayorDeTres {

    public static int mayorDeTres(int nro1, int nro2, int nro3) {
        int nromayor = 0;
        if (nro1 > nro2 && nro1 > nro3) {
            nromayor = nro1;
        } else {
            if (nro2 > nro3) {
                nromayor = nro2;
            } else {
                nromayor = nro3;
            }
        }
        return nromayor;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nro1, nro2, nro3;
        
        System.out.println("El mayor de tres numeros");

        System.out.print("Ingrese el número 1: ");
        nro1 = teclado.nextInt();

        System.out.print("Ingrese el número 2: ");
        nro2 = teclado.nextInt();

        System.out.print("Ingrese el número 3: ");
        nro3 = teclado.nextInt();

        System.out.println("El número mayor de los tres es: " + mayorDeTres(nro1, nro2, nro3));
    }    
}
