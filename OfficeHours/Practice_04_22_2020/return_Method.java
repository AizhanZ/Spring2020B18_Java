package OfficeHours.Practice_04_22_2020;

public class return_Method {

    public static void main(String[] args) {
       // sum(10, 20);
        int num1 = sum2(10, 20);//num1 is reusable, can be used later
        //if it returns a value you can assign it to a variable
        //in order to make it reusable assign it to a variable
        System.out.println(num1);
        //num1  variable is ready to use for other test steps right

        System.out.println("===========================");
        String str = "Cybertek";

        //reverse string
        String result = "";
        //the purpose of this string is that we gonna
        // reverse the string and assign it to the "result"
        for(int i = str.length()- 1; i >= 0; i--){
            result += str.charAt(i);//i is a variable that will be decreasing in our case reversing
        }

        System.out.println(result);
        String name = "level";//checks if this string a palindrome
        //reverse(name); //can be printed like that
        String name2 = reverse(name);//if I assign it to var it wil become reusable

        System.out.println(name2);

        System.out.println(name.equals(name2));

        System.out.println( reverse(name) );
        //print will print but will not be reusable
        //to reuse assign to a variable

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }//void method

    public static int sum2(int a, int b){//return method
        return a+b;
    }//return method

    public static String reverse(String str){
        String result = "";
        for(int i = str.length()- 1; i >= 0; i--){
            result += str.charAt(i);//i is a variable that will be decreasing in our case reversing
        }
        //return "Hello";//its a bug because we need return result
        return result;//the purpose of this "result" is to return the reversed version
    }



}
