
package cfp10;

import java.util.Scanner; // libreria

public class Promedio {

    public static void main(String[] args) {
        
    float nota1,nota2,nota3,notafinal; //he declarado la variable de tipo real
    
    System.out.print("Ingrese la nota 1: "); //escribir: impresion con salto de linea
    Scanner teclado = new Scanner(System.in);
    nota1 = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    System.out.print("Ingrese la nota 2: "); //escribir: impresion con salto de linea
    nota2 = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    System.out.print("Ingrese la nota 3: "); //escribir: impresion con salto de linea
    nota3 = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    notafinal = (float) (nota1+nota2+nota3)/3; //castear un dato
    System.out.println("El promedio de las 3 notas es: "+notafinal);    // TODO code application logic here
    }
    
}
