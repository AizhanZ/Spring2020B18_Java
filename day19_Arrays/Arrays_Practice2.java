package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println(arr.length); //3

        int [] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String[] Testers = new String[3];// {"Reem", "Madina", "Osman"
                // 0 1 2

        Testers[0] = "Reem";
        Testers[2] = "Osman";
        System.out.println(Testers[0]);//Reem
        System.out.println(Testers[1]);// null
        System.out.println(Testers[2]);//Osman

        System.out.println(arr2.length);//3

        System.out.println("=========================");
        //write a program that asks "enter a name" 10 times, and store each of the names in the array students

        String[] students = new String[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name");

        students[0] = "a";
        students[1] = "b";
        students[2] = "c";
        students[3] = "d";
        students[4] = "e";
        students[5] = "f";
        students[6] = "g";
        students[7] = "h";
        students[8] = "i";
        students[9] = "j";

        System.out.println(students[1]);
        System.out.println(students.length);






    }

}
