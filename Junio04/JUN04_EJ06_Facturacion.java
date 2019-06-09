package cfp10;

import java.util.Scanner;

public class JUN04_EJ06_Facturacion {

    public static void imprDatos(int codigo[], double litros[], double precio[]) {
        double totalfc = 0, total = 0, totlitros = 0;
        int cantfc = 0;
        System.out.println("");
        for (int i = 0; i < codigo.length; i++) {
            totalfc = precio[i] * litros[i];
            total = total + totalfc;
            if (codigo[i] == 1) {
                totlitros = totlitros + litros[i];
            }
            if (totalfc > 600) {
                cantfc = cantfc + 1;
            }
        }
        System.out.println("");
        System.out.println("Facturación total $ " + total);
        System.out.println("Cantidad de litros del art.1 :" + totlitros);
        System.out.println("Cantidad de FC de mas de $600: " + cantfc);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int largovector = 5;
        int codigo[] = new int[largovector];
        double litros[] = new double[largovector];
        double precio[] = new double[largovector];

        for (int i = 0; i < largovector; i++) {
            System.out.println("");
            System.out.println("Factura #" + (i + 1));
            System.out.print("Ingrese codigo de producto: ");
            codigo[i] = sc.nextInt();
            System.out.print("Ingrese cantidad de litros: ");
            litros[i] = sc.nextDouble();
            System.out.print("Ingrese precio: ");
            precio[i] = sc.nextDouble();
        }
        imprDatos(codigo, litros, precio);
    }
}
