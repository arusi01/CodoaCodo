package cfp10;

import java.util.Scanner;

public class UN04_EJ01_Perimetro_Cuadrado {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculo del perimetro de un cuadrado.");
    System.out.println("");
    System.out.print("Ingrese el area: ");
    double area = sc.nextDouble();
    double perimetro = Math.sqrt(area)*4;

    System.out.println("");
    System.out.println("El perimetro del cuadrado es: "+perimetro);    
    }    
}
