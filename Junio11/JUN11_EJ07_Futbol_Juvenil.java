package cfp10;

import java.util.Scanner;

public class JUN11_EJ07_Futbol_Juvenil {

    public static boolean ingresoOk(int edad) {
        boolean ingresa = false;
        if (edad >= 13 && edad <= 18) {
            ingresa = true;
        }
        return (ingresa);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Futbol juvenil.");
        System.out.println("");

        System.out.print("Ingrese edad candidato: ");
        int edad = sc.nextInt();
        
        if (ingresoOk(edad)) {
           System.out.println("Ingreso OK.");
        }else{
           System.out.println("NO Ingresa.");            
        }
    }

}
