package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_Practice {

    public static void main(String[] args) {
        /*
        200, OK
        201, Created
        202, Accepted
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Status Code:");
        int statusCode = scan.nextInt();

        String result = "";

        if(statusCode == 200){
            result = "Ok";
        }else if(statusCode == 201){
            result = "Created";
        }else if(statusCode == 202){
            result = "Accepted";
        }else{
            result = "Invalid Status Code";
        }

        System.out.println(result);

        String result2 = (statusCode == 200) ? "Ok"
                : (statusCode == 201) ? "Created"
                : (statusCode == 202) ? "Accepted"
                : "Invalid Status Code";

        System.out.println(result2);

    }

}
