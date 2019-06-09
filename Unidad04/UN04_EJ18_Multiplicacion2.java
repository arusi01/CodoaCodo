package cfp10;

import java.util.Scanner;

public class UN04_EJ18_Multiplicacion2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nro, resultado;

        System.out.println("Multiplicacion Tabla del 1 al 10.");
        System.out.println("");

        System.out.print("Ingrese un número: ");
        nro = sc.nextInt();

        //while
        System.out.println("");
        int i = 1;
        while (i < 11) {
            resultado = nro * i;
            System.out.println(nro + " * " + i + " = " + resultado);
            i++;
        }
    }
}
