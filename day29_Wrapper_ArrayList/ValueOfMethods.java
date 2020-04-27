package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);//Integer, 123
        //assigning wrapper class to another wrapper class is neither auto nor unboxing
        System.out.println(a);

        //byte c = 10;
        //Integer b = c;errror

        double b = Integer.valueOf(str);
        //double = returns Integer ==> unboxing

        System.out.println(b);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        //if we pass parse it returns primitive
        //double = double ==> none

        double d2 = Double.valueOf(str2);
        //double = Double (wrapper class) ==> unboxing

        System.out.println(d1);//15.5
        System.out.println(d2);//15.5

        System.out.println(d1 == d2);

        System.out.println("====================");
        //only wrapper classes dedicated to primitives
        int z1 = 2000;
        //Long L1 = z1;//doesn't accept any other primitives except for long
        //wrapper class = loyal
        //primitives = not loyal

        Short sh1 = 3000;
        int z2 = sh1;//we can assign wrapper class to primitive

        /*
        "True
        "False ==> to boolean
        "10000000.5 ==> to float
        "123456" ==> to int
         */

        String r1 = "Today is Monday";
        Boolean t1 = Boolean.valueOf(r1); //Boolean, true
                // Boolean = Bolean // none
        boolean t2 = Boolean.valueOf(r1); //Boolean, true
        //boolean = Boolean // unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("======================");
        int maxNum = Integer.MAX_VALUE;

        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;

        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE; //127
        System.out.println(maxNum3);

        byte minNum2 = Byte.MIN_VALUE;//-128
        System.out.println(minNum2);

        System.out.println("====================");

        double[] arr = new double[3];
        System.out.println(Arrays.toString(arr));


        Character[] arr2 = new Character[3];
        System.out.println(Arrays.toString(arr2));




    }

}
