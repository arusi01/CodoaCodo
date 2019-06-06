package cfp10;

import java.util.Scanner;

public class MAY28_Vectores_numeros2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese largo del vector: ");
        int largo = sc.nextInt();    
        
        int total=0;
        int vector[] = new int[largo];
        
        for (int posicion=0; posicion < vector.length; posicion++) {

            System.out.print("Ingrese Numero ["+posicion+"]: ");
            vector[posicion] = sc.nextInt();            
            
        }
        for (int posicion=0; posicion < vector.length; posicion++) {
            total=total+vector[posicion];                  
        }
        
        System.out.println("Total: "+total);
    }
}
