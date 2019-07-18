package JUN18_ArrayList_Nombres;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();  // Dinamico
                 
        lista.add("Alberto");
        lista.add("Carlos");
        lista.add("Pepe");
        
//      for  CTRL+SPACE
        for(int i=0; i < lista.size(); i++){
            String datos = lista.get(i);
            System.out.println("Nombre: "+datos);
        }
    }
    
}
