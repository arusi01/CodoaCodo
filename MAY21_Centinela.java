
package cfp10;

import java.util.Scanner; // libreria

public class MAY21_Centinela {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int contador=1;
        final int centinela=-1;
        int acumulador=0;
        int nota;
        
        while (contador < 5) {
            System.out.println("Ingrese nota: "+contador);
            nota=sc.nextInt();
            acumulador = acumulador + nota;
            
            if (nota == centinela) {
                 break;
            }
            
            contador=contador+1;
        }
        System.out.println("Suma de notas: "+acumulador);
    }
}
