package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 7921 JonesBranch Dr, Mcean VA, 22034
        // fullAddress: Building number Street, City, State, Zipcode

        System.out.println("Building number: ");
        int Bnumber = input.nextInt();// 7925 --> Enter0

        System.out.println("Street: ");
        String street = input.nextLine();


    }

}
