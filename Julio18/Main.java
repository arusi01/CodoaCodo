package JUN18_ArrayList_Double;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       ArrayList<Double> lista = new ArrayList<>();  // Dinamico
               // Clase Integer
                 
        lista.add(2.0);
        lista.add(5.0);
        lista.add(7.0);
        
//      for  CTRL+SPACE
        for(int i=0; i < lista.size(); i++){
            Double datos = lista.get(i);
            System.out.println("N°: "+datos);
            
            if (lista.get(i).equals(5.0)) {
                System.out.println("5.0 Encontrado en posicion: "+i);
            }
        }
    }
}
    

