package cfp10;

import java.util.Scanner;

public class UN04_EJ15_Calculadora_Basica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char operacion;
        String tipo = "";
        boolean error = true;
        int largovector = 2;
        double nro[] = new double[largovector];
        double resultado = 0;

        System.out.println("Calculadora basica.");
        System.out.println("");

        do {
            System.out.print("Tipo de operacion (+ - * /): ");
            operacion = sc.next().charAt(0);
            if (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/') {
                error = false;
            } else {
                System.out.println("Tipo de operacion invalida ingrese nuevamente.");
            }
        } while (error);

        for (int i = 0; i < largovector; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            nro[i] = sc.nextDouble();
            if (i == 1 && nro[i] == 0 && operacion == '/') {
                System.out.println("Error: El valor del divisior no puede ser cero. Ingrese nuevamente.");
                i--;
            }
        }

        switch (operacion) {
            case '+':
                tipo = "SUMA";
                resultado = nro[0] + nro[1];
                break;
            case '-':
                tipo = "RESTA";
                resultado = nro[0] - nro[1];
                break;
            case '*':
                tipo = "MULTIPLICACION";
                resultado = nro[0] * nro[1];
                break;
            case '/':
                tipo = "DIVISION";
                resultado = nro[0] / nro[1];
                break;
        }
        System.out.println("");
        System.out.println("Tipo de operacion: " + tipo + " resultado: " + resultado);
    }
}
