import java.util.Scanner;
public class Question3 {

    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10 : ");
        int value = scan.nextInt();
        assert value>=1 && value<=10 : "The entered number is out of range";
        System.out.println("The value entered is: " + value);

    }
}
