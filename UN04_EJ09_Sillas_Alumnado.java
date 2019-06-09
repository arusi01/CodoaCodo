package cfp10;

import java.util.Scanner;

public class UN04_EJ09_Sillas_Alumnado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo disponibilidad sillas alumnado.");
        System.out.println("");

        System.out.print("Ingrese la cantidad de alumnos: ");
        int alumnos = sc.nextInt();
        System.out.print("Ingrese la cantidad de asientos disponibles: ");
        int sillas = sc.nextInt();
        System.out.println("");

        if (alumnos>sillas) {
            int faltante=alumnos-sillas;
            System.out.println("Insuficiente, faltan "+faltante+" asientos.");
        } else {
            System.out.println("Suficientes asientos para todo el alumnado.");
        }
    }
}
