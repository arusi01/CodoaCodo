package cfp10;

import java.util.Scanner;

public class UN06_EJ13_Dos_Mayores {

    public static void ingresoManual(double vector[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIngreso de datos por teclado:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese Nº" + (i + 1) + ": ");
            vector[i] = sc.nextDouble();
        }
        sc.close();
    }

    public static void ingresoAzar(double vector[]) {

        int nro = 100;
        for (int posicion = 0; posicion < vector.length; posicion++) {
              vector[posicion] = (Math.random() * (nro + 1));
//            vector[posicion] = Math.floor((Math.random() * (nro + 1)));
        }
    }

    public static void mayor(double vector[]) {

        double mayor[] = new double[2];

        if (vector[0] > vector[1]) {
            mayor[0] = vector[0];
            mayor[1] = vector[1];
        }

        for (int i = 2; i < vector.length; i++) {
            if (vector[i] > mayor[0]) {
                mayor[1] = mayor[0];
                mayor[0] = vector[i];
            } else {
                if (vector[i] > mayor[1]) {
                    mayor[1] = vector[i];
                }
            }
        }
        System.out.println("\nMayores:");
        System.out.printf("N.1: %.2f", +mayor[0]);
        System.out.printf("\nN.2: %.2f", +mayor[1]);
        System.out.println("");
    }

    public static void mostrar(double vector[]) {
        System.out.println("\nMostrando array de tamaño "+vector.length+":");
        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.printf("%.2f | ", vector[posicion]);
            //System.out.print(vector[posicion] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dos Mayores de un vector.");
        System.out.print("\nIngrese largo del vector a crear: ");
        int largo = sc.nextInt();

        double vector[] = new double[largo];
        char opcion;

        System.out.println("");
        do {
            System.out.print("Ingreso de los datos por teclado o al azar (T o A): ");
            opcion = sc.next().charAt(0);
            opcion = Character.toLowerCase(opcion);
        } while (opcion != 't' && opcion != 'a');
        
        if (opcion == 't') {
            ingresoManual(vector);
        } else {
            ingresoAzar(vector);
        }
        mostrar(vector);
        mayor(vector);
    }
}
