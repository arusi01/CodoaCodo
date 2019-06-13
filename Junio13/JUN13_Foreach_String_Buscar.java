package cfp10;

import java.util.Scanner;

public class JUN13_Foreach_String_Buscar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String vector[] = new String[5];
        boolean encontrado = false;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese nombre [" + (i + 1) + "]: ");
            vector[i] = sc.next();
        }
        System.out.print("Ingrese nombre a buscar:");
        String busqueda = sc.next();

        for (String nombre : vector) {   //FOREACH

            if (nombre.equalsIgnoreCase(busqueda)) {
                encontrado = true;
            }

        }
        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("NO Encontrado");
        }
    }
}
