package cfp10;

import java.util.Scanner;

public class UN04_EJ11_Tipo_Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del tipo de triangulo.");
        System.out.println("");

        int largovector = 3;
        int lado[] = new int[largovector];

        for (int i = 0; i < largovector; i++) {
            System.out.print("Ingrese el lado " + (i + 1) + ": ");
            lado[i] = sc.nextInt();
        }
        System.out.println("");
        if (lado[0] > (lado[1] + lado[2]) || lado[1] > (lado[0] + lado[2]) || lado[2] > (lado[0] + lado[1])) {
            System.out.println("Las medidas del triangulo son invalidas. ");
        } else {
            String tipo;
            if (lado[0] == lado[1] && lado[1] == lado[2]) {
                tipo = "equilatero";
            } else {
                if (lado[0] == lado[1] || lado[1] == lado[2] || lado[0] == lado[2]) {
                    tipo = "isoceles";
                } else {
                    tipo = "escaleno";
                }
            }
            System.out.println("Es un triangulo " + tipo);
        }
    }
}
