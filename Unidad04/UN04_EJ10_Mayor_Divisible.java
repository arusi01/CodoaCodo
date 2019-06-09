package cfp10;

import java.util.Scanner;

public class UN04_EJ10_Mayor_Divisible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo de dos numeros, si el mayor es divisible.");
        System.out.println("");

        int largovector = 2;
        int nro[] = new int[largovector];
        for (int i = 0; i < largovector; i++) {
            do {
                System.out.print("Ingrese el numero " + (i + 1) + " (0-100): ");
                nro[i] = sc.nextInt();
                if (nro[i] > 100 || nro[i] < 0) {
                    System.out.println("El numero ingresado esta fuera de rango. Ingrese nuevamente");
                }
            } while (nro[i] < 0 || nro[i] > 100);
        }
        if (nro[0] < nro[1]) {
            int aux = nro[0];
            nro[0] = nro[1];
            nro[1] = aux;
        }
        System.out.println("");
        if (nro[0] % nro[1] == 0) {
            System.out.println(nro[0] + " es divisible por " + nro[1]);
        }else{
            System.out.println(nro[0] + " no es divisible por " + nro[1]);
        }
    }
}
