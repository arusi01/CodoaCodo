
package cfp10;

import java.util.Scanner; // libreria

public class MAY14_EJ01_Username {
    
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    String Usuario1="alberto";
    String Password1="123456";
    
    System.out.print("Ingrese su usuario: ");
    String Username = teclado.nextLine();
    System.out.print("Ingrese su contraseña: ");
    String Password = teclado.nextLine();            

    if (Usuario1.equals(Username)&&Password1.equals(Password)) {
        System.out.println("Acceso correcto. Bienvenido "+Username);
    }else{
        System.out.println("Acceso denegado. El usuario o la contraseña es incorrecta");        
    }
            
            
    }
}
