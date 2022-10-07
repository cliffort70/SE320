import java.util.ArrayList;

    public class Question2 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(14);
            list.add(24);
            list.add(14);
            list.add(42);
            list.add(25);

            ArrayList<Integer> newList = removeDuplicates(list);

            System.out.print(newList);
        }

        public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
            /* Your implementation here */
            ArrayList<E> newList = new ArrayList<E>();
            for(int i=0; i< list.size(); i++){
                if(!newList.contains(list.get(i)) ) {
                    newList.add(list.get(i));
                }
            }
            return newList;
        }
    }

