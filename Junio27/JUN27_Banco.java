package cfp10;

import java.util.Scanner;

public class JUN27_Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largovector = 5;
        int numero[] = new int[largovector];
        String tipo[] = new String[largovector];
        float saldo[] = new float[largovector];

        System.out.println("Banco Modesto: ");

        for (int i = 0; i < largovector; i++) {
            System.out.println("\nIngrese los datos de la cuenta: ");
            System.out.print("Numero [" + (i + 1) + "]: ");
            numero[i] = sc.nextInt();
            System.out.print("Tipo [" + (i + 1) + "]: ");
            tipo[i] = sc.next();
            System.out.print("Saldo [" + (i + 1) + "]: ");
            saldo[i] = sc.nextFloat();
        }
        System.out.println("");
        System.out.println("Datos Ingresados: ");
        int index = 0;
        for (int nrocta : numero) {   //FOREACH
            System.out.println("Cuenta Numero: " + nrocta + "\tTipo: " + tipo[index] + "\tSaldo: " + saldo[index]);
            index++;
        }
    }
}
