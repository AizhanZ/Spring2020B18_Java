package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        //days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //the format can be changed to a different, ex: dd/mm/yy
        //if I provide 3 MMM for month it will print Apr
        //for the month MUST provide upper case


        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        System.out.println("=================");
        /*
        create a date called birthDay: month/Days/year
        ex: 2020 04 23
            April/23/20
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yy");

        LocalDate date2 = LocalDate.of(1999, 12, 25);
        //first call the Formatter from local date(date2)
        String str1 = date2.format(dtf2);
        //assign to string to make it reusable or just print it out, then it won't be reusable

        System.out.println(str1);


    }

}
