package OfficeHours.Practice_05_20_2020;

class test{

    public test(String str){
        System.out.println("String");
    }
    public test(int a){
        System.out.println("int");
    }
    public test(double a){
        System.out.println("double");
    }
}

public class Constructor2 extends test{

    public Constructor2(){
        super("hello");//this will be the output
        System.out.println("default");//then default
    }
    /*
    public void method(){ method cannot call constructor
        super("hello");
    }

     */

    public static void main(String[] args) {
        Constructor2 obj = new Constructor2();
    }

}
