package day20_ArraysContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        int[] n = new int[3];
        n[0] = 0;
        n[1] = 1;
        n[2] = 2;
        n[3] = 3;

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    //       0       1     2
        /*
        String[] months2 = new String[12];
            months2[0] = "Jan";

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
            int num = input.nextInt();
            if(num > 12){
                System.out.println("Invalid Entry");
                System.exit(0);
            }

            String result = months[num-1];

        System.out.println(result);


    }

}
