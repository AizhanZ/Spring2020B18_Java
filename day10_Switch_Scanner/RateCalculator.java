package day10_Switch_Scanner;

import java.util.Scanner;

public class RateCalculator {
    /*
     write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = scan.nextInt();

        System.out.println("How many hours do you work a week?");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work a year");
        byte numberofWeeks = scan.nextByte();

        //hourlyRate = (salary / numberofWeeks)/ weeklyHours

        int hourlyRate = (salary / numberofWeeks)/ weeklyHours;

        System.out.println("Your hourly rate is: " + hourlyRate);


    }
}
