/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganancia;

import java.util.Scanner;

public class Ganancia {

    public static void main(String[] args) {
    float inversion,impgan; //he declarado la variable de tipo real
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Ingrese el monto de la inversion: "); //escribir: impresion con salto de linea
    inversion = teclado.nextFloat(); //Leer ingresar datos por teclado
    
    impgan = (float) ((float) inversion*0.02); //castear un dato
    System.out.println("El Precio con descuento del producto es: "+impgan);    // TODO code application logic here
    }
    
}
