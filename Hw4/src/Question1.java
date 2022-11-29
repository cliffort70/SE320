package SE320.Hw4.src;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

public class Question1 {
    
    public static void main(String [] args){
        Day d = new Day(2002, 6, 4);
        Calendar cal = Calendar.getInstance();
        Day curD = new Day(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        

        System.out.println(curD.daysFrom(d)); 
        
    }
      
}
