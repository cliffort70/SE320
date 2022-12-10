package SE320.Final.Question2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class BMIClient {
    public static void main(String[] args) {
       try {   
            Socket s = new Socket("localhost", 8080);  
            
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your weight in kilograms: ");
            out.writeDouble(scan.nextDouble());
            
            System.out.print("\nEnter your height in meters: ");
            out.writeDouble(scan.nextDouble());

            System.out.println("Your BMI is: " + in.readDouble());

            scan.close();
            s.close();

        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
