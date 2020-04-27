package day25_MethodsRecap;

public class return_statement {

    public static void main(String[] args) {
        /*
        if(10 > 9){
            return;//exits the current method only, it doesn't stop the entire system
        }

        System.out.println("hello");

         */
        //method1();
        method2();

        System.out.println("hello");
    }

    public static void method1(){

        if(10 > 9){
            //you can use return method if you are not returning aything
            //no if you want to return something
            return;

        }
        System.out.println("hello cybertek");//won't be printed
    }

    public static void method2(){

        if(10 > 9){
            System.exit(0);

        }

        System.out.println("hello cybertek");//won't be printed

    }

}
