package Coding;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int count = 1;
        while(count <= num){
            System.out.print(count + ", ");
            count+=5;
        }


         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = input.nextInt();

        int total = 0;
        while(num > 0){
            total += num;
            num = input.nextInt();
        }
        System.out.println("sum of all number "+total);
    }

}
