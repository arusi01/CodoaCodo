package cfp10;

import java.util.Scanner;

public class UN05_EJ03_esPar {
    
    public static boolean esPar(int nro1) {
        if (nro1 % 2 == 0) {
            return (true);
        } else {
            return (false);
        }
    }
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Es PAR?");
        System.out.print("\nIngrese un número: ");
        int nro1 = teclado.nextInt();
        
        if (esPar(nro1)) {
           System.out.println("Es PAR");
        }else{   
           System.out.println("Es IMPAR");
        }   
    }
}
