
package cfp10;

import java.util.Scanner;

public class JUN04_Cubo {
    
    public static double cubo(double lado) {
        double area = Math.pow(lado, 3);
        return (area);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese medida: ");
    double lado = sc.nextDouble();
        
    System.out.println("La medida es: "+cubo(lado));    
    }
    
}
