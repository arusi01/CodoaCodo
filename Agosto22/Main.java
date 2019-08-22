package AGO22_Iterator_ArrayList2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();

        a1.add("Carlos");  // agregar valores
        a1.add("Alberto");  // agregar valores
        a1.add("Diego");  // agregar valores
        a1.add("Karina");  // agregar valores
        
        System.out.println("For : ");
        System.out.println(a1); //mostrar los valores
        // a1 principio itr (cursor) apuntara al indice justo antes
        
        Iterator itr = a1.iterator();
        
        //verificando la disponibilidad del siguiente elemento
        System.out.println("Iterator: ");
        while(itr.hasNext())
        {
            //mueve el cursor al siguiente elemento
            String i = (String)itr.next(); //casteo de tipo string
            //obteniendo elementos iguales uno por uno
            System.out.print(i + " ");
            
            if (i.equals("Diego"))
            itr.remove();
            
        }    
        System.out.println();
        System.out.println(a1);
    }
}
