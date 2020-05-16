package Replit;

import java.util.Scanner;

public class R79_StringNoEnd {
/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

 */
    public static void main(String[] args) {
        //Muhtar's code
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        txt = txt.substring(0, txt.length() - 1);
        System.out.println(txt);

    }

}
