package AGO22_Persona;

import java.util.ArrayList;
import java.util.Iterator;

public class Testiterador {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> lista = new ArrayList();
        
        Persona per1 = new Persona("alberto", 34);
        Persona per2 = new Persona("daniel", 43);
        Persona per3 = new Persona("ramiro", 25);

        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        
        Iterator<Persona> itr = lista.iterator();
        while (itr.hasNext()) {
            Persona next = itr.next();
            if (next.equals(per2)) {
                System.out.println(" nombre: "+next.getNombre()+" "+next.getDni());
            }
        }
    }

}
