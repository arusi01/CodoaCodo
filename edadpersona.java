
package cfp10;

import java.util.Scanner; // libreria

public class edadpersona {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    int edad;
    
    System.out.print("Ingrese la edad de la persona: ");
    edad = teclado.nextInt();
    
    if (edad<18) {
        System.out.println("La persona es menor de edad");
    }else{
        System.out.println("La persona es mayor de edad");
    }
    
    }
}
