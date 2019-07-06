
package cfp10;

import java.util.Scanner; // libreria

public class espejo {
    
      public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
    float base,altura,lado,area, perimetro; //he declarado la variable de tipo real
    
    System.out.print("Ingrese la base del triaangulo: "); //escribir: impresion con salto de linea
    base = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    System.out.print("Ingrese la altura del triangulo: "); //escribir: impresion con salto de linea
    altura = teclado.nextFloat(); //Leer ingresar datos por teclado

    System.out.print("Ingrese el lado: "); //escribir: impresion con salto de linea
    lado = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    area = (float) (base * altura)/2; //castear un dato
    perimetro = (float) (base + altura + lado);
    
    System.out.println("El area del triangulo es: "+area+" y el perimetro es: "+perimetro);    // TODO code application logic here
    }
    
}
