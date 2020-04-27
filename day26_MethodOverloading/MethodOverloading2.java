package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    first method: print the sum of two int numbers
    second method: print the sum of three int numbers
    third method: print the sum of four int numbers
     */
    public static void main(String[] args) {
        //10, 5
        sum2Numbers(10, 5);
        //10, 5, 15
        sum3Numbers(10, 5, 15);
        //10, 20, 30, 5
        sum4Numbers(10, 20, 30, 5);

        double[] arr = {5,4,7,1,2};
        Arrays.sort(arr);//not efficient way

        System.out.println("==================");

        //10, 5
        sum(10, 5);
        //15, 10, 5
        sum(15, 10, 5);
        //10, 20, 30, 5
        sum(10, 20, 30, 5);

        int[] arr1 = {3,2,1};

        char[] arr2 = {'z', 's', 'a'};

        double[] arr3 = {7.4,6,5,20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);//same method name, different parameter

        System.out.println("=====================");
        //20, 30
        sum1(20, 30);
        //15.5, 15.5
        sum1(15.5, 15.5);

    }

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }

    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    //==============================================

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
/*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */

    public static void sum1(int a, int b){
        System.out.println(a+b);
    }

    public static void sum1(double a, double b){
        System.out.println(a+b);
    }

}
