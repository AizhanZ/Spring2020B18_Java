package Replit;
import java.util.Scanner;
public class R67_ReverseIt {
/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
/*
        if(word.length() == 5){
            System.out.println(word.charAt(4)+word.charAt(3)+word.charAt(2)+
                    word.charAt(1)+word.charAt(0));
        }else if(word.length() < 5 ){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long");
        }
*/
        int lastIndexNum = word.length() - 1;

        if (word.length() == 5) {
            String reverse = "";
            for (int i = lastIndexNum; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(reverse);
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else if (word.length() <= 4) {
            System.out.println("Too short!");
        }

    }

}
