
package cfp10;

import java.util.Scanner; // libreria

public class NumeroMayor {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    Float Nro1,Nro2;
    
    System.out.print("Ingrese el numero 1: ");
    Nro1 = teclado.nextFloat();

    System.out.print("Ingrese el numero 2: ");
    Nro2 = teclado.nextFloat();
    
    if (Nro1<Nro2) {
        System.out.println("El Numero "+Nro2+" es mayor que "+Nro1);
    }else{
        System.out.println("El Numero "+Nro1+" es mayor que "+Nro2);
    }
    
    }

}
