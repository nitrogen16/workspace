package buonCompleanno;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Buon Compleanno!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(weekDayOfBirthday("30.05.1984", "2015"));
        System.out.println(weekDayOfBirthday("1.12.2015", "2016"));
    }

    public static String weekDayOfBirthday(String birthday, String year) {
        //напишите тут ваш код
    	LocalDate localDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("d.M.yyyy", Locale.ITALIAN));
    	System.out.println(localDate);
    	localDate = localDate.withYear(Year.parse(year).getValue());
    	System.out.println(localDate);
    	return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
    }
}

