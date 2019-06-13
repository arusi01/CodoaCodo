package cfp10;

import java.util.Scanner;

public class JUN13_Foreach_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String vector[] = new String[5];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese nombre [" + (i+1) + "]: ");
            vector[i] = sc.next();
        }

        for (String nombre : vector) {   //FOREACH
            System.out.println("Nombre: " + nombre);
        }
    }
}
