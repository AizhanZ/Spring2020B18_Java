package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    ask the use to enter salary
    ask the user to enter full name
    ask the user to enter company name
    ask the user to enter the SSN
    ask the user to enter the JobTitle
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();


    }

}
