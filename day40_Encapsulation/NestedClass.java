package day40_Encapsulation;

public class NestedClass {



    static class data{

        static int a = 100;
        static int b = 300;

    }

    //only inner nested class can be static
    public static void main(String[] args) {
        //nested class can be called through the class name
        //NestedClass.data
        System.out.println(NestedClass.data.a);
    }

}
