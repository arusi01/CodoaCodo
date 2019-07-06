
package cfp10;

import java.util.Scanner; // libreria

public class EJ04_Su_Nombre {
    
    public static void main(String[] args) {
        
    String Nombre;
    
    System.out.print("Ingrese su nombre: ");
    Scanner teclado = new Scanner(System.in);
    Nombre = teclado.nextLine();
    
    System.out.println("Hola "+Nombre);
    }
    
}
