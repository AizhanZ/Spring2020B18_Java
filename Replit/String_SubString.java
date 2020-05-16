package Replit;
/*
using substring method output the first two letters of text string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.
 */
import java.util.Scanner;
//Muhtar's code
public class String_SubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        //your code here
        System.out.print(txt.substring(0, 2));
    }
}
