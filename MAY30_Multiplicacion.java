
package cfp10;

import java.util.Scanner;

public class MAY30_Multiplicacion {
    
//   public static Scanner sc = new Scanner(System.in);  // GLOBAL
    
    public static void multiplicacion() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad uno: ");
        int cant1 = sc.nextInt();
        System.out.print("Ingrese cantidad dos: ");
        int cant2 = sc.nextInt();
        
        int resultado = cant1 * cant2;
        
        System.out.println("El resultado de la multiplicacion es: "+resultado);
                
    }
    
    public static int multiplicacion1(int cant1, int cant2) {
        int resultado = cant1 * cant2;
        return resultado;
    }
    
    public static void main(String[] args) {
//        multiplicacion();
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad uno: ");
        int cant1 = sc.nextInt();
        System.out.print("Ingrese cantidad dos: ");
        int cant2 = sc.nextInt();
        
        int resultado = multiplicacion1(cant1, cant2);
        
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }
}
