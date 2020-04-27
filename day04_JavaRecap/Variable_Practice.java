package day04_JavaRecap;

public class Variable_Practice {

    public static void main(String[] args) {

        /*when declare a variable
        DataType variableName = Data;

         */

        byte num1 = 127;
        short num2 = num1; //double > float > long > int > short > byte

        //byte num3 = num2; error

        int num4 = num2;

        long num5 = 99999999999l; //int is preferred by compiler. This number is out of the range.

        float num6 = 100l;
        System.out.println(num6); // 100.0
        // 1.100, 2.100L, 3.100.0

        float num7 = 0.5f;
        System.out.println(num7); //0.5;

        double num8 = 0.5f;
        double num9 = 99999L;
        double num10 = 100.5;
        System.out.println(num10);


        char ch1 = '$'; //every single character has a corresponding number
        System.out.println(ch1); //$

        char ch2 = 4500;
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1);//56

        int a2 = 'z';
        //int accepts only whole numbers
        System.out.println(a2);//122

        double d1 = 'z' + '8';//can assign char because double range is larger than char
        //178.0
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9 > 10 ); //false

        System.out.println( 9 >= 10 ); //true

        System.out.println( 9 != 10 ); //true

        System.out.println('a' == 'b'); //false

        //System.out.println('a' == "a"); // doesn't match - one is char another is string

        System.out.println( 'a' == 'b' -1 );
                        //  97 == 98 - 1
                        // 97 == 97 ==> true

        System.out.println("Muhtar" == "Good Guy"); //false
        //                  Bad Guy == Good guy == > false

        System.out.println("Muhtar" != "Good Guy"); //true

        System.out.println("Muhtar" == "muhtar"); //false

       // System.out.println("Cybertek" == 10000);

        boolean r1 = !true; //false
        System.out.println(r1); //false
        System.out.println(!r1); //true

        System.out.println(!true == false); //true

        System.out.println(!true != !false); //true























    }

}
