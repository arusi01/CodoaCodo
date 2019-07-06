package cfp10;

import java.util.Scanner;

public class MAY28_Vectores_nombre {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese largo del vector: ");
        int largo = sc.nextInt();
        
        String nombre[] = new String[largo];
        int edad[] = new int[largo];
        
        for (int posicion=0; posicion < largo; posicion++) {
        
            System.out.print("Ingrese Nombre: ");
            nombre[posicion] = sc.next();
            
            System.out.print("Ingrese Edad: ");
            edad[posicion] = sc.nextInt();
        }
        
        System.out.printf("%7s %7s\n","NOMBRE","EDAD");
        for (int posicion=0; posicion < largo; posicion++) {
            System.out.printf("%7s %7s\n",nombre[posicion],edad[posicion]);           
        }
        
    }    
}
