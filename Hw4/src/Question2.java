package SE320.Hw4.src;
//
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        List lst = new ArrayList(); 
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(1);

        removeDuplicates(lst);
        System.out.print(lst);
    }
   
    public static void removeDuplicates(List lst) {
        //requires: duplicate elements must be adjacent to each other
        if (lst == null || lst.size() == 0) return;
        List copy = new ArrayList(lst);
        Iterator elements = copy.iterator();
        Object pre = elements.next();
        while(elements.hasNext()) {
        Object nex = elements.next();
        if (pre.equals(nex)) lst.remove(nex);
        else pre = nex;
        }
        }
        
    
}
