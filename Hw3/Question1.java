package SE320.Hw3;

import java.util.LinkedHashSet;




public class Question1 {
    static LinkedHashSet first = new LinkedHashSet<String>();
    static LinkedHashSet second = new LinkedHashSet<String>();
    static LinkedHashSet union = new LinkedHashSet<String>();
    static LinkedHashSet intersection = new LinkedHashSet<String>();
    static LinkedHashSet difference = new LinkedHashSet<String>();
    public static void main(String[] args) {
    
        first.add("George"); 
        first.add("Jim");
        first.add("John");
        first.add("Blake"); 
        first.add("Kevin");
        first.add("Michael");

        second.add("George"); 
        second.add("Katie"); 
        second.add("Kevin"); 
        second.add("Michelle"); 
        second.add("Ryan"); 

       union();
       intersection();
       difference();
       
    }
    public static void union ( ){
            union.addAll(first);
            union.addAll(second);
            System.out.println(union);

    }
    public static void intersection(){
           intersection.addAll(first);
           intersection.retainAll(second);
           System.out.println(intersection);
    }
    public static void difference(){
           difference.addAll(first);
           difference.addAll(second);
           difference.removeAll(intersection);
           System.out.println(difference);
    }
    
}
