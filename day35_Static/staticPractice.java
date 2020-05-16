package day35_Static;

import java.util.Scanner;

public class staticPractice {
//when to use static variable instead of instance

    static Scanner scan = new Scanner(System.in);//declared as instance variable
    //if there is one variable then should use one static
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

    System.out.println("sum is: " + (num1+num2));

    }

    public void method(){//instance method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Multiplication: " + (num1+num2));
    }

}

