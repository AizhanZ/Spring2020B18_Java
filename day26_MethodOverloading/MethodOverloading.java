package day26_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        method(10); //"original method" because 10 is int
        method(10.0);//need to pass decimal number will give overloaded method

    }

    public static void method(int a){
        System.out.println("Original method");
    }

    public static void method(double a) {//is called overloaded method because we passed a parameter
        System.out.println("Overloaded method");
    }
}
