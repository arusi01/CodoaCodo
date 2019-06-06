
package descuento;

import java.util.Scanner; // libreria

public class Descuento {

    public static void main(String[] args) {
        
    float precio,total; //he declarado la variable de tipo real
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Ingrese el precio del producto: "); //escribir: impresion con salto de linea
    precio = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    total = (float) precio-(precio*15/100); //castear un dato
    System.out.println("El Precio con descuento del producto es: "+total);    // TODO code application logic here
    }
    
}
