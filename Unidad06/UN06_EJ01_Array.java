package cfp10;

import java.util.Scanner;

public class UN06_EJ01_Array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int largo = 5;    
        int vector[] = new int[largo];
        
        System.out.println("Array o arreglo unidimensional con un tamaño de 5");
        System.out.println("");
        
        for (int posicion=0; posicion < vector.length; posicion++) {
            System.out.print("Ingrese Numero ["+(posicion+1)+"]: ");
            vector[posicion] = sc.nextInt();            
        }
        System.out.println("");
        for (int posicion=0; posicion < vector.length; posicion++) {
        System.out.println("Nº"+(posicion+1)+" ingresado: "+vector[posicion]);
        }
    }  
}
