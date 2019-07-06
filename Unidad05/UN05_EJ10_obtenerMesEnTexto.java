package cfp10;

import java.util.Scanner;

public class UN05_EJ10_obtenerMesEnTexto {

    public static String obtenerMesEnTexto(int mes){
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
        return (nombremes);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mes del año.");

        System.out.print("\nIngrese el numero del mes: ");
        int mes = sc.nextInt();

        System.out.println("");
        System.out.println(obtenerMesEnTexto(mes));
    }    
}
