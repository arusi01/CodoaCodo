
package cfp10;


public class JUN06_Burbuja_Menor {

  public static void main(String[] args) {

       int vector[] = {6, 4, 5, 8, 7};
       int aux = 0;

           for (int posicion = vector.length; posicion > 0; posicion--) {
               for (int posicion2 = vector.length-1; posicion2 > 0; posicion2--) {
                   if (vector[posicion]+1 < vector[posicion]) {
                       aux = vector[posicion];
                       vector[posicion] = vector[posicion + 1];
                       vector[posicion + 1] = aux;
                   }
               }
           }
       
       for (int posicion = 0; posicion < vector.length; posicion++) {
          System.out.println("Nro ["+posicion+"]: " + vector[posicion]);         
       }    
       
   }        
}
