import java.util.Scanner;

public class Question_1 {
    static int num1;
    static int num2;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter two numbers to be added together.\n");
        numadd();
    }
    public static void numadd(){
        try {
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            System.out.println("The sum of num 1 and num 2 is " + (num1+num2));
        } catch (Exception e){
            System.out.print("Please check values submitted and enter again.\n");
            scan.nextLine();
            numadd();
        }
    }
}