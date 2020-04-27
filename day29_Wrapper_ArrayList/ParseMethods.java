package day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ParseMethods {

    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str); //123
        //since its returning int we can assign to int

        System.out.println(str + 1);//text
        //                "123 + 1 ==> 1231 returns as string
        System.out.println(a1 + 1);//number
        //                123 + 1 ==> 124

        byte b1 = Byte.parseByte(str);//byte = 123

        System.out.println(b1+5);//byte

        Integer I1 = (int)Byte.parseByte(str);//Autoboxing

        String str2 = "12.5";
        float f1 = Float.parseFloat(str2); //float 12.5
        //since its returning float we can assign it to float primitive

        System.out.println(f1 + 1);//13.5

        double d1 = Double.parseDouble(str2);//12.5

        System.out.println(d1 + 1);//double 13.5

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);//3147483647 returns this number as long

        System.out.println(num1 + 2);

        Long num2 = Long.parseLong(str3);//autoboxing

        System.out.println(num2 + 2);

        String result1 = "true";

        boolean a = true;

        boolean r1 = Boolean.parseBoolean(result1);//boolean

        System.out.println(r1);

        String result2 = "fALsE";

        boolean r2 = Boolean.parseBoolean(result2);

        System.out.println(r2);//false - ignores case sensitivity


    }

}
