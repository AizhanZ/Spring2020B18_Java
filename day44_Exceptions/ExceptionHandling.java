package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{
            System.out.println(str.charAt(100));
        }catch(RuntimeException e){//checked exception
           String description = e.getMessage();//instance method
           System.out.println(description);
        }

        System.out.println("============================");

        try {
            System.out.println(100 / 0);//unchecked exception
        } catch(ArithmeticException e){
           String description = e.getMessage();
            System.out.println(description);
        }


        System.out.println("completed");
    }
    /*
    testCase:
        step1
        step2
        step3
        step4
        ...
        step10
     */


}
