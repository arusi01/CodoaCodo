package cfp10;

import java.util.Scanner;

public class MAY30_Mayor {
   
    public static int mayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }else{
            return num2;
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad uno: ");
        int cant1 = sc.nextInt();

        System.out.print("Ingrese cantidad dos: ");
        int cant2 = sc.nextInt();
        
        System.out.println("El mayor es: "+mayor(cant1, cant2));
    }
    
}
