package SE320.Hw3;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Question3 {
    public static void main(String[] args) throws ParseException {
        NumberFormat uk = NumberFormat.getInstance(Locale.UK);
        uk.setMaximumFractionDigits(2);
        double d= 12345.678;
        System.out.println(uk.format(d));
        NumberFormat us = NumberFormat.getCurrencyInstance();
        System.out.println(us.format(d));
        String s ="12345.678";
        NumberFormat convert = NumberFormat.getInstance();
        Number sn = convert.parse(s);
        System.out.println(sn);
    }
}
