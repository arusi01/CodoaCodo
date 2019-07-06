
package cfp10;

import java.util.Scanner;

public class ventalapices {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    int cantidad; 
    float costo;
    
    System.out.print("Ingrese cantidad de lapices: ");
    cantidad = teclado.nextInt();
    
    if (cantidad<1000) {
        costo=cantidad*0.90F;
    }else{
        costo=cantidad*0.85F;
    }
    
    System.out.println("El Importe total de la venta de lapices es: "+costo);
    
    }
}
