package SE320.Final.Question2;

import java.io.*;
import java.net.*;

public class BMIServer {
    public static void main(String[] args) {
        try {    
            ServerSocket s = new ServerSocket(8080);   
            while (true) {
                
                Socket client = s.accept();
        
                Thread thread = new Thread(() -> {
                    try {     
                        DataInputStream in = new DataInputStream(client.getInputStream());
                        DataOutputStream out = new DataOutputStream(client.getOutputStream());
                                 
                        double weight = in.readDouble();
                        double height = in.readDouble();
            
                        double bmi = weight / (height * height);
            
                        out.writeDouble(bmi);
            
                        client.close();
                    } catch (IOException e) {
                        System.out.println("exception");
                    }
                });
                thread.start();
            }
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
