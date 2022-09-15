import java.util.Scanner;

public class Question_2 {
    static int num1;
    static int[] ran = new int[100];
    static Scanner scan= new Scanner(System.in);
    public static void main(String [] args){

        for(int i=0;i< ran.length;i++){
            ran[i]= (int)(Math.random()*100+1);
        }
        System.out.println("Pick a number 1-100 to see its corresponding number in the array");
        arrcheck();
    }
    public static void arrcheck() {
        try {
            num1 = scan.nextInt();
            int el= ran[num1-1];
            System.out.println("The number in section " + num1 + " of the array is " + el);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
            System.out.print("Please check the index submitted and enter again.\n");
            scan.nextLine();
            arrcheck();
        } catch (Exception e){
            System.out.print("It has to be a number.\n");
            scan.nextLine();
            arrcheck();
        }

    }
}
