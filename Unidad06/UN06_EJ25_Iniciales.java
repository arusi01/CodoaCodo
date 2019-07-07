package cfp10;

import java.util.Scanner;

public class UN06_EJ25_Iniciales {
    
    public static void mostrarIniciales(String nombre){
        String iniciales=nombre.substring(0, 1);
        for (int i=1;i<nombre.length();i++){
            if (nombre.substring(i, i+1).equals(" ")){
                iniciales=iniciales+nombre.substring(i+1, i+2);
                i++;        
            }
        }
        System.out.println("\n"+iniciales.toUpperCase());
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Mostrar iniciales.");
        System.out.println("");

        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = sc.nextLine();

        mostrarIniciales(nombre);
    }
}
