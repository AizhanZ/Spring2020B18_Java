package day05_Unary_ShorthandOperators;

public class LeapYear {
    /*
    Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
     */

    public static void main(String[] args) {

        short year = 2020;

        // leapYear: year % 4 == 0
        // should be divisible by 4
        //if returns true ==> means leapYear, it it returns false ==> not leapYear
        boolean leapYear = year % 4 == 0; //if a year can be divided by 4 without any remainder, then it's leap year

        //System.out.println( year + " is a leap year: " + leapYear);

        String result = year + " is a leap year: " + leapYear;
        System.out.println(result);

    }

}
