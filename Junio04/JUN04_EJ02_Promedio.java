package cfp10;

import java.util.Scanner;

public class JUN04_EJ02_Promedio {
    
    public static double promedio() {

        Scanner teclado = new Scanner(System.in);
        
        int nro, contador = 0;
        double resultado=0;
        
        do {
            contador++;
            System.out.print("Ingrese número #" + contador + " (0 para finalizar): ");
            nro = teclado.nextInt();
            if (nro != 0) {
                resultado = resultado + nro;
            }
        } while (nro != 0);
        resultado = resultado/(contador-1);
        return resultado;
    }

    public static void main(String[] args) {


        System.out.println("Promedio.");
        System.out.println("");
        System.out.printf("El promedio es = %.2f %n", promedio());
    }
}
