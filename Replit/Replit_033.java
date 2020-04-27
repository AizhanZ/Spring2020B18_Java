package Replit;
/*
-Declare int variables: seniorCitizens, nonSeniorCitizens, age
-Create a Scanner object
- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"

-Ask user to enter age:
"What is new citizen's age?"

-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

-At last, print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"
 */
import java.util.Scanner;

public class Replit_033 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System .in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int count1 = input.nextInt();
        int count2 = input.nextInt();

        System.out.println("What is new citizen's age?");
        int age = input.nextInt();

        if(age >= 65){
            System.out.println("Senior Citizen");
            count1++;
        }else{
            System.out.println("Non-Senior Citizen");
            count2++;
        }

        System.out.println("New seniorCitizens count " + count1 );
        System.out.println("New nonSeniorCitizens count " + count2 );




    }

}
