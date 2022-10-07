 import java.util.Arrays;

    public class Question1<E> {

        public static void main(String[] args) {

            GenericStack stack = new GenericStack();
            System.out.println("Current Size " + stack.getSize());
            System.out.println("Is stack empty? " + stack.isEmpty());
             stack.push(3);
             stack.push(4);
             stack.push(5);
             stack.push(6);
             stack.push(4);
             stack.push(5);
             stack.push(6);
            System.out.println("Current Size " + stack.getSize());
            System.out.println("Pop: " + stack.pop());
            System.out.println("peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            stack.push(5);
            stack.push(6);
            System.out.println("Is empty: " + stack.isEmpty());
            System.out.println("Current Size " + stack.getSize());
            System.out.println(stack.toString());

        }

        static private class GenericStack<E> {

            private int length;
            private int size;
            private E[] array;

            public GenericStack(){
                length =2;
                array = (E[])new Object[length];
            }

            public GenericStack(int length){
                this.length = length;
                array = (E[])new Object[length];
            }


            public int getSize() {
                return size;
            }

            public E peek() {
                if (size == 0)
                    return null;
                else
                    return array[size-1];
            }

            public void push(E o) {
                array[size++] = o;

                if (size == length) {
                    E[] dob = (E[])new Object[length *= 2];
                    System.arraycopy(array, 0, dob, 0, array.length);
                    array = dob;
                }
            }

            public E pop() {
                if (size == 0)
                    return null;
                else
                   size--;
                return array[size];

            }

            public boolean isEmpty() {
                return size == 0;
            }

            @Override
            public String toString() {
                E[] del = (E[])new Object[size];
                System.arraycopy(array, 0, del, 0, size);
                array = del;
                return Arrays.toString(array);
            }
        }
    }