package SE320.Hw3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Question2 {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new FileReader("SE320/Hw3/file.txt"));
        TreeSet words = new TreeSet<>();
        while(file.hasNextLine()){
            words.add(file.nextLine());
        }
        System.out.println(words);
        file.close();
    }
}
