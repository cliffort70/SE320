package SE320.Hw4.src;

import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Date;

public class Question1 {
    
    public static void main(String [] args){
        Day d = new Day(2002, 6, 4);
        Day curD = new Day(2022, 11, 27);
        System.out.println(curD.daysFrom(d)); 
        
    }
      
}