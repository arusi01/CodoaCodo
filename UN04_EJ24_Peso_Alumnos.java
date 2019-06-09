package cfp10;

import java.util.Scanner;

public class UN04_EJ24_Peso_Alumnos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int peso, contador = 0;
        double promedio=0;

        System.out.println("Mayor y menor peso de los alumnos.");
        System.out.println("");

        do {
            contador++;
            System.out.print("Ingrese peso alumno #" + contador + " (0 para finalizar): ");
            peso = teclado.nextInt();
            if (peso != 0) {
               promedio = promedio+peso;
            }
        } while (peso != 0);
        promedio = promedio/(contador-1);
        System.out.println("");
        System.out.printf("El promedio es = %.2f %n", promedio);
    }
}
