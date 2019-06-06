
package cfp10;

import java.util.Scanner;

public class MAY30_Promedio {

    public static void promedio() {
        
        Scanner sc = new Scanner(System.in);

        int sumaNotas=0,cantNotas,notaFinal;
        
        System.out.print("Ingrese cantidas de notas: ");
        cantNotas = sc.nextInt();
        int nota[] = new int[cantNotas];
        
        for (int posicion = 0; posicion < nota.length; posicion++) {
            System.out.print("Ingrese nota #"+(posicion+1)+": ");
            nota[posicion] = sc.nextInt();
            sumaNotas = sumaNotas + nota[posicion];
        }
        notaFinal=sumaNotas/cantNotas;

        System.out.println("El promedio de las notas: "+notaFinal);        
    }
    public static void main(String[] args) {
        
        promedio();
    }
    
}
