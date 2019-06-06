
package cfp10;

import java.util.Scanner; // libreria

public class MAY21_notas_maximo_minimo {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int notamayor=0;
        int notamenor=0;
        float nota;
        
        for(int contador=1;contador<=10;contador++){
            
            System.out.println("Ingrese la nota "+contador+" del alumno");
            nota = teclado.nextInt();
            
            if (nota>=7) {
                notamayor=notamayor+1;
            }else{
                notamenor=notamenor+1;
            }
        }
        System.out.println("");
        System.out.println("Cantidad de notas mayores o iguales a 7 = "+notamayor);
        System.out.println("Cantidad de notas menores a 7 = "+notamenor);
    }
}
