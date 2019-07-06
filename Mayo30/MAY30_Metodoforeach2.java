package cfp10;

import java.util.Scanner;

public class MAY30_Metodoforeach2 {
    //******* METODO ********
    //**MEDOTO tipo: "VOID = vacio, no retorna (return)"
    //**MEDOTO tipo: "INT = ENETRO, RETORNA (DATO ENTERO "return")"
    //
    // [modificador] [Tipo_Valor_devuelto nombreMet (Lista_argumentos) {
    //    public            int          sumaEnteros   (int a ,int b)
    //    public            void         sumaEnteros         ()  
    // bloque de codigos
    // }
    public static int sumaEnteros () {  // Metodo de tipo VOID o VACIO
        
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, resultado;
        System.out.println("Ingrese primer valor: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese segundo valor: ");
        numero2 = sc.nextInt();        
 
        resultado = numero1 + numero2;
        
        return resultado;   
    }
    
    public static void main(String[] args) {
        // EJECUCION DEL METODO3
 
        System.out.println("la suma es: "+sumaEnteros());
        
    }

    //****MEDOTO*****    
}
