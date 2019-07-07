package cfp10;

import java.util.Scanner;

public class UN06_EJ11_Posicion_en_Blanco {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int largo = 10;
        int nro = 100;
        int borrar;
        String vector[] = new String[largo];

        System.out.println("Array al azar del tamaño de " + largo);
        System.out.println("");

        for (int posicion = 0; posicion < vector.length; posicion++) {
            vector[posicion] =  Integer.toString((int) Math.floor((Math.random() * (nro + 1))));
        }

        do {
            System.out.print("Ingrese posicion a borrar (0-" + (largo-1) + "): ");
            borrar = sc.nextInt();
        } while (borrar < 0 | borrar > (largo-1));

        vector[borrar]="";
        
        for (int posicion=0; posicion < vector.length; posicion++) {
        System.out.println("Posicion Nº"+posicion+": "+vector[posicion]);
        }
    }
}
