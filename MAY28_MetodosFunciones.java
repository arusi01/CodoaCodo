package cfp10;

import java.util.Scanner;

public class MAY28_MetodosFunciones {
    
    static Scanner sc = new Scanner(System.in); // estatico afuera static
    
    public static void sumaEnteros() {   //no retorna nada con void
        System.out.println("Ingrese un numero: ");
        int a=sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("La suma es: "+c);
    }
    
    public static void sumaEnteros2(int a,int b) {   //no retorna nada con void
        int c=a+b;
        System.out.println("La suma es: "+c);
    }
    
    public static int sumaEnteros3(int aa,int bb) {   //retorno entero
        int cc=aa+bb;
        return cc;
    }
    
    public static void main(String[] args) {
// metodo sumaEnteros
        sumaEnteros();

// metodo sumaEnteros2        
        System.out.println("Ingrese un numero: ");
        int a=sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b=sc.nextInt();
        
        sumaEnteros2(a,b);

// metodo sumaEnteros3 con retorno
        System.out.println("Ingrese un numero: ");
        int aa=sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int bb=sc.nextInt();
        
        sumaEnteros3(aa,bb);
        System.out.println("La suma es: "+cc);        
        
    }
}
