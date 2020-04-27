package Replit;

import java.util.Scanner;

public class R24_PatientInformation {

        public static void main(String[] args) {
            //Enter your code here
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the patient portal!");
            System.out.println("Please enter your personal information");

            System.out.println("Enter your first name");
            String firstName = scan.next();

            System.out.println("Enter your last name");
            String lastName = scan.next();

            System.out.println("Enter your email");
            String email = scan.next();

            System.out.println("Enter your street");
            String street = scan.next();

            System.out.println("Enter your city");
            String city = scan.nextLine();

            System.out.println("Enter your state");
            String state = scan.nextLine();

            System.out.println("Enter your zip code");
            int zipcode = scan.nextInt();

            System.out.println("Enter your work phone number");
            long workPhoneNumber = scan.nextLong();

            System.out.println("Enter your personal phone number");
            long personalPhoneNumber = scan.nextLong();

            System.out.println("Enter your age");
            int age = scan.nextInt();

            System.out.println("Enter your height");
            double height = scan.nextDouble();

            System.out.println("Enter your weight");
            double weight = scan.nextDouble();

            System.out.println("Are you married?");
            boolean isMarried = scan.nextBoolean();

            String fullName = "Full name: " + lastName + ", " + firstName;
            String address = "Address: " + street + ", " + city + ", " + ", " + state + ", " + zipcode;
            String contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;

            System.out.println("Patient personal information");

            System.out.println(fullName);
            System.out.println(address);
            System.out.println(contacts);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight + " pounds");
            System.out.println("Married?: " + isMarried);

        }
    }

