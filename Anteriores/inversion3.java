package cfp10;

import java.util.Scanner; // libreria

public class inversion3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        float persona1,persona2,persona3;
        float inversion,porcentaje1,porcentaje2,porcentaje3;

        System.out.print("Ingrese la inversion de la persona1: "); //escribir: impresion con salto de linea
        persona1 = teclado.nextFloat(); //Leer ingresar datos por teclado

        System.out.print("Ingrese la inversion de la persona2: "); //escribir: impresion con salto de linea
        persona2 = teclado.nextFloat(); //Leer ingresar datos por teclado

        System.out.print("Ingrese la inversion de la persona3: "); //escribir: impresion con salto de linea
        persona3 = teclado.nextFloat(); //Leer ingresar datos por teclado

        inversion=persona1+persona2+persona3;
        porcentaje1=persona1*100/inversion;
        porcentaje2=persona2*100/inversion;
        porcentaje3=persona3*100/inversion;
        
        System.out.println("");
        System.out.println("El porcentaje invertido de la persona 1 es: "+porcentaje1);
        System.out.println("El porcentaje invertido de la persona 2 es: "+porcentaje2);
        System.out.println("El porcentaje invertido de la persona 3 es: "+porcentaje3);
   
    }
    
}
