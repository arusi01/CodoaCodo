package cfp10;

import java.util.Scanner;

public class UN04_EJ17_Multiplicacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nro, resultado;

        System.out.println("Multiplicacion Tabla del 1 al 10.");
        System.out.println("");

        System.out.print("Ingrese un número: ");
        nro = sc.nextInt();

        //for
        System.out.println("");
        for (int i = 1; i < 11; i++) {
            resultado = nro * i;
            System.out.println(nro + " * " + i + " = " + resultado);
        }
    }
}
