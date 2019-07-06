
package cfp10;

import java.util.Scanner; // libreria

public class EJ05_Suma {
   
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    float Nro1,Nro2,Resultado; //he declarado la variable de tipo real

    System.out.print("Ingrese el primer numero: ");
    Nro1 = teclado.nextFloat();
    
    System.out.print("Ingrese el segundo numero: ");
    Nro2 = teclado.nextFloat();
    
    Resultado=(float) Nro1+Nro2;
    System.out.println("La suma de "+Nro1+" + "+Nro2+" es: "+Resultado);

    }
    
}
