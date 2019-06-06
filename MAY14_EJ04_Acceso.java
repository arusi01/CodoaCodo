
package cfp10;

import java.util.Scanner; // libreria

public class MAY14_EJ04_Acceso {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int CBarra; //he declarado la variable de tipo entero
        String CRetina;
    
        System.out.println("Control de Acceso Laboratorio");
        System.out.println("");
        System.out.print("Ingrese el codigo de barra: ");
        CBarra = teclado.nextInt();
        System.out.print("Ingrese el codigo lector de retina: ");
        CRetina = teclado.next();
        
        System.out.println("");
        if (CRetina.equals("shyj") && CBarra==1234) {
            System.out.println("Acceso Permitido");        
        }else{
            System.out.println("Acceso Denegado");
        }
    }
}
