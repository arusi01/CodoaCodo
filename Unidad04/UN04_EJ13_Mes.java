package cfp10;

import java.util.Scanner;

public class UN04_EJ13_Mes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mes del año.");
        System.out.println("");
        int mes;

        do {
            System.out.print("Ingrese el numero del mes: ");
            mes = sc.nextInt();
            if (mes > 12 || mes < 1) {
                System.out.println("El numero ingresado esta fuera de rango. Ingrese nuevamente");
            }
        } while (mes < 1 || mes > 12);

        String nombremes = "";

        switch (mes) {
            case 1:
                nombremes = "ENERO";
                break;
            case 2:
                nombremes = "FEBREO";
                break;
            case 3:
                nombremes = "MARZO";
                break;
            case 4:
                nombremes = "ABRIL";
                break;
            case 5:
                nombremes = "MAYO";
                break;
            case 6:
                nombremes = "JUNIO";
                break;
            case 7:
                nombremes = "JULIO";
                break;
            case 8:
                nombremes = "AGOSTO";
                break;
            case 9:
                nombremes = "SEPTIEMBRE";
                break;
            case 10:
                nombremes = "OCTUBRE";
                break;
            case 11:
                nombremes = "NOVIEMBRE";
                break;
            case 12:
                nombremes = "DICIEMBRE";
                break;
        }
        System.out.println("");
        System.out.println(nombremes);
    }
}
