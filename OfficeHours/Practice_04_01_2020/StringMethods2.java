package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {

    public static void main(String[] args) {
        // isEmpty(): checks if the String is empty, returns boolean (it will true, if not empty returns false)
        String str1 = " ";

        boolean r1 = str1.isEmpty();//returns false
        boolean r2 = !str1.isEmpty(); //returns true

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("=========================");
        //equals(str): checks if the two strings of text are equal or not, returns boolean
        // equalsIgnoreCase(str): checks if the two strings of text are equal or not without case sensitivity, returns boolean

        //== (also checks memory locations)

        String s1 = "cat";
        String s2 = new String("Cat");
        String s3 = "Cat";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true because checks only visible text

        System.out.println(s3.equals(s1));// false because of case sensitivity

        System.out.println(s3.equalsIgnoreCase(s1)); //true, ignores the case sensitivity

        System.out.println("=========================");
        //contains(str): checks if the str is included in the string, if included true, if not false

        String sentence = "I like to learn Java";

        System.out.println(sentence.contains("Java")); //returns true

        String sentence2 = "Top s viruses are: 1. Corona, 2. Hanta, 3. Ebola";

        System.out.println(sentence2.contains("Corona"));

        System.out.println("=========================");
        //startsWith(str): checks if the string started with given str
        //endsWith(str): checks if the string ended with given str

        String webAddress = "www.amazon.com";

        System.out.println(webAddress.startsWith("www"));// returns true

        System.out.println(webAddress.startsWith("wwww"));//rettrueurns false

        String gmail = "CybertekSchool@gmail.com";

        System.out.println(gmail.endsWith("@gmail.com"));//returns true

        System.out.println(gmail.endsWith("@hotmail.com"));//returns false





    }

}
