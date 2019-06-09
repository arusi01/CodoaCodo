package cfp10;

import java.util.Scanner;

public class UN04_EJ20_Notas_Curso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double promedio = 0;

        System.out.println("Promedio de notas del curso.");
        System.out.println("");
        System.out.print("Cantidad de notas a ingresar: ");
        int largovector = sc.nextInt();

        int nro[] = new int[largovector];
        System.out.println("");
        for (int i = 0; i < largovector; i++) {
            do {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                nro[i] = sc.nextInt();
                if (nro[i] > 10 || nro[i] < 0) {
                    System.out.println("El numero ingresado esta fuera de rango (0-10). Ingrese nuevamente");
                } else {
                    promedio = promedio + nro[i];
                }
            } while (nro[i] < 0 || nro[i] > 10);
        }
        promedio = promedio / largovector;
        System.out.println("");
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
