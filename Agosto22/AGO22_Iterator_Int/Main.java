package AGO22_Iterator_Int;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
        
        numbers.add(2);
        numbers.add(5);
        numbers.add(20);
        
        //FOREACH
        for (Iterator<Integer> numbersIterator = numbers.iterator(); numbersIterator.hasNext(); ) {
            System.out.println(numbersIterator.next());
        }
        
//        Iterator<Integer> numbersIterator = numbers.iterator();
//        
//        while(numbersIterator.hasNext()) {
//            System.out.println(numbersIterator.next());
//        }
    }
    
}

