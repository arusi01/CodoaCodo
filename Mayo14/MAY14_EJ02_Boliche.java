
package cfp10;

import java.util.Scanner; // libreria

public class MAY14_EJ02_Boliche {
    
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int Edad; //he declarado la variable de tipo entero
    String Dni;
    
    System.out.println("Acceso al boliche");
    System.out.print("Ingrese su dni: ");
    Dni = teclado.nextLine();
    System.out.print("Ingrese su edad: ");
    Edad = teclado.nextInt();

    if (Edad>18 || Edad==18) {
       System.out.println("DNI: "+Dni+" es mayor de edad. Acceso permitido");        
    }else{
       System.out.println("DNI: "+Dni+" es menor de edad. Acceso denegado");      
    }
    
    }
}

