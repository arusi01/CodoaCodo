package cfp10;

import java.util.Scanner;

public class JUN18_EJ02_Sueldos {

    static double sueldo[] = new double[5];

    public static void promedioSueldo() {
        double sumaSueldo = 0, promedio;
        for (int posicion = 0; posicion < sueldo.length; posicion++) {
            sumaSueldo = sumaSueldo + sueldo[posicion];
        }
        promedio = sumaSueldo / sueldo.length;
        System.out.println("");
        System.out.println("Promedio Total: " + promedio);
    }

    public static void ingresaSueldo() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sueldo.length; i++) {
            System.out.print("Ingrese Sueldo #" + (i + 1) + " ");
            sueldo[i] = sc.nextDouble();
        }
    }

    public static void ordenaSueldo() {
        double aux;
        for (int posicion = 0; posicion < sueldo.length - 1; posicion++) {
            for (int posicion2 = 0; posicion2 < sueldo.length - posicion - 1; posicion2++) {
                if (sueldo[posicion2] > sueldo[posicion2 + 1]) {
                    aux = sueldo[posicion2];
                    sueldo[posicion2] = sueldo[posicion2 + 1];
                    sueldo[posicion2 + 1] = aux;
                }
            }
        }

    }

    public static void imprimirSueldo() {
        System.out.println("");
        for (int posicion = 0; posicion < sueldo.length; posicion++) {
            System.out.println("Sueldo [" + (posicion + 1) + "]: " + sueldo[posicion]);
        }
    }

    public static void main(String[] args) {
        ingresaSueldo();
        ordenaSueldo();
        imprimirSueldo();
        promedioSueldo();
    }
}
