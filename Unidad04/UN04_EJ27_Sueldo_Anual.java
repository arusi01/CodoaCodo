package cfp10;

import java.util.Scanner;

public class UN04_EJ27_Sueldo_Anual {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        double sueldo = 0, sueldoanual = 0;
        boolean aux = true;

        System.out.println("Sueldo anual.");
        System.out.println("");

        do {
            contador++;
            System.out.print("Ingrese sueldo mes " + contador + " (<0 para finalizar): ");
            sueldo = teclado.nextDouble();
            if (sueldo >= 0 && contador <= 12) {
                sueldoanual = sueldoanual + sueldo;
            }
            if (sueldo < 0 || contador == 12) {
                aux = false;
            }
        } while (aux);
        System.out.println("");
        if (contador == 12) {
            System.out.println("El sueldo anual del empleado es = " + sueldoanual);
        } else {
            System.out.println("El sueldo parcial hasta el mes " + (contador-1) + " del empleado es = " + sueldoanual);
        }
    }
}
