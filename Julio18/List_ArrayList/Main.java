package JUN18_List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int vector[] = new int [3];   // Vector Estatico
        
        List<String> list = new ArrayList<>();
  
        ArrayList<Integer> lista = new ArrayList<>();  // Dinamico
               // Clase Integer
                 
        lista.add(2);
        lista.add(5);
        lista.add(7);
        
//      for  CTRL+SPACE
        for(int i=0; i < lista.size(); i++){
            Integer datos = lista.get(i);
            System.out.println("N°: "+datos);
            
            if (lista.get(i).equals(5)) {
                System.out.println("5 Encontrado en posicion: "+i);
            }
        }
        
        System.out.println("\nN°: "+lista);
        
        for(int i=0; i < lista.size(); i++){
            if (lista.get(i).equals(7)) {
                lista.remove(i);
            }
        }
        System.out.println("\nN°: "+lista);        
    }
}
