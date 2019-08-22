package AGO22_Iterator_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            a1.add(i);  // agregar valores
        }
        System.out.println("For : ");
        System.out.println(a1); //mostrar los valores
        // a1 principio itr (cursor) apuntara al indice justo antes
        
        Iterator itr = a1.iterator();
        
        //verificando la disponibilidad del siguiente elemento
        System.out.println("Iterator: ");
        while(itr.hasNext())
        {
            //mueve el cursor al siguiente elemento
            int i = (Integer)itr.next(); //casteo de tipo entero
            //obteniendo elementos iguales uno por uno
            System.out.print(i + " ");
            
            // Eliminando elementos impares
            if (i % 2 !=0)
                itr.remove();
        }    
        System.out.println();
        System.out.println("Removiendo elementos impares: ");
        System.out.println(a1);
    }
}
