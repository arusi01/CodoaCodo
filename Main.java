package AGO22_Interator;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        
        names.add("Rosario");
        names.add("Pedro");
        names.add("Camilo");
        
        Iterator<String> namesIterator = names.iterator();
        
        while(namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
    }
    
}
