package Replit;
/*
Write a program that will print a week day according to the day number. Use switch statement.
Display message: "Enter number:"
1
Display message: "Monday"
 */
import java.util.Scanner;

public class R55_WeekDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");

        int num = input.nextInt();

        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
        /* Muhtar's code
        System.out.println("Enter number:");
        int number = scan.nextInt();
        String result="";

        switch(number){
            case 1:result="Monday";
                break;

            case 2:result="Tuesday";
                break;

            case 3:result="Wednesday";
                break;

            case 4:result="Thursday";
                break;

            case 5:result="Friday";
                break;

            case 6:result="Saturday";
                break;

            case 7:result="Sunday";
                break;
        }

        System.out.println(result);
         */
    }
}
