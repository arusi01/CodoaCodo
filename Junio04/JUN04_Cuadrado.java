
package cfp10;

import java.util.Scanner;

public class JUN04_Cuadrado {
    
    public static int cuadrado(int nro) {
        int resultado = nro*nro;
        return (resultado);
    }

    public static double raiz(int nro) {
        int resultado = nro^(1/2);
        float i=0;
        float x1,x2;
        while( (i*i) <= nro ) {
            i+=0.1;
            x1=i;
        }
        for(int j=0;j<10;j++)
        {
           x2=nro;
           x2/=x1;
           x2+=x1;
           x2/=2;
           x1=x2;
        }
        
        return (resultado);
    }
        
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese Nro1: ");
    int nro = sc.nextInt();
        
    System.out.println("Cuadrado : "+cuadrado(nro)); 
    System.out.println("Raiz : "+raiz(nro));  
    }
    
}
