
package cfp10;

import java.util.Scanner;

public class MAY23_Zapatos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        float precio;
        float total = 0;
        int cantidad;

        System.out.print("Ingrese precio del zapato: ");
        precio=sc.nextFloat();
        System.out.print("Ingrese cantidad de pares: ");
        cantidad=sc.nextInt();        
        
        if (cantidad>30) {
            total=(float) (precio-(precio*0.40))*cantidad;
        } else {
           if (cantidad>20) {
              total=(float) (precio-(precio*0.30))*cantidad;
           }else{
              if (cantidad>10) {
                 total=(float) (precio-(precio*0.10))*cantidad;
              }else{
                  total=(float) precio*cantidad;
              }
           }
        }
        System.out.println("");
        System.out.println("El Precio total de la compra es: "+total);        
        
    }
}
