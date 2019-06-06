/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner; // libreria

public class Area {  // case sensitive

    public static void main(String[] args) {
    
    float base,altura,area; //he declarado la variable de tipo real
    
    System.out.print("Ingrese la base del rectangulo: "); //escribir: impresion con salto de linea
    Scanner teclado = new Scanner(System.in);
    base = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    System.out.print("Ingrese la altura del rectangulo: "); //escribir: impresion con salto de linea
    altura = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    area = (float) (base * altura); //castear un dato
    System.out.println("El area del rectangulo es: "+area);    // TODO code application logic here
    }
    
}
