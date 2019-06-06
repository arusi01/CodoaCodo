/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_triangulo;

import java.util.Scanner; // libreria

public class Area_Triangulo {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
    float base,altura,area; //he declarado la variable de tipo real
    
    System.out.print("Ingrese la base del triaangulo: "); //escribir: impresion con salto de linea
    base = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    System.out.print("Ingrese la altura del triangulo: "); //escribir: impresion con salto de linea
    altura = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    area = (float) (base * altura)/2; //castear un dato
    System.out.println("El area del triangulo es: "+area);    // TODO code application logic here
    }
    
}
