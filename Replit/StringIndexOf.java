package Replit;

public class StringIndexOf {
/*
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
 */
    public static void main(String[] args) {
        String txt = "foo bar";
       // System.out.println(txt.substring(0,txt.length()-1));
        System.out.println(txt.indexOf("b"));
        System.out.println(txt.indexOf("foo"));
    }
}
