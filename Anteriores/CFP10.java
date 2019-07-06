package cfp10;

import java.util.Scanner;

public class CFP10 {

    public static void main(String[] args) {
        // TODO code application logic here
    float celsius, fahrenheit; //he declarado la variable celsius de tipo real
    System.out.println("Ingrese los grados celsius: "); //escribir: impresion con salto de linea
    Scanner teclado = new Scanner(System.in);
    celsius = teclado.nextFloat(); //Leer ingresar datos por teclado
    fahrenheit = (float) (celsius * 1.8 + 32); //castear un dato
    System.out.println("La temperatura en Fahrenheit: "+fahrenheit);
    }
    
}
