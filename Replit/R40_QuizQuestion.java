package Replit;
/*
Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class R40_QuizQuestion {

    Scanner s = new Scanner(System.in);

    System.out.println("what is the farthest planet in the solar system:" );
    System.out.println("a)venus" );
    System.out.println("b)pluto" );
    System.out.println("c)neptune" );

    //byte a = 3;
    String answer = s.nextLine();

    //your code here
    if(a == false){
        answer = "a is wrong";
    }else if(a == true){
        answer = "b is correct";
    }else if(a == false){
        answer = "c is wrong";
    }else{
        System.out.println("z is not a valid answer");
    }

 */
import java.util.Scanner;

public class R40_QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune" );

        String answer = s.nextLine();

        if(answer.equals("a")){
            System.out.println("a is wrong");
        }else if(answer.equals("b")){
            System.out.println("b is correct");
        }else if(answer.equals("c")){
            System.out.println("c is wrong");
        }else{
            System.out.println(answer + " is not a valid answer");
        }
        /* Muhtar's code
        if (answer.equals("b")) {
            System.out.println("b is correct");
        } else if (answer.equals("a")) {
            System.out.println("a is wrong");
        } else if (answer.equals("c")) {
            System.out.println("c is wrong");
        } else {
            System.out.println(answer + " is not a valid answer");
        }
         */
    }
}
