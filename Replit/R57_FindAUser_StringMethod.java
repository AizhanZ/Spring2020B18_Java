package Replit;
import java.util.Scanner;
public class R57_FindAUser_StringMethod {
    /*
    Write a program that will look up for user.
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String sentence = scan.nextLine();
    //WRITE YOUR CODE HERE
    boolean result = sentence.contains(word);
    System.out.println(result);

  }
  Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //WRITE YOUR CODE HERE
            System.out.println("Enter full name:");
            String name = scan.nextLine();

            if((name.equalsIgnoreCase("Max Payne")) || (name.equalsIgnoreCase("Alan Wake"))){
                System.out.println("User found!");
            }else{
                System.out.println("User not found!");
            }
    }
}
