package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = 100;
/*
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }
        if(number % 2 != 0){
            System.out.println(number + " is odd number");
        }

 */
        if(number % 2 == 0){
            System.out.println(number + " is odd number");
        } else {
            System.out.println(number + " is odd number");
        }

        int age = 30;

        if(age >= 21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }

        boolean testedPositiveForCorona = true;
        if(testedPositiveForCorona){
            System.out.println("Buy more toilet paper and stay at home");
        } else {
            System.out.println("Do more coding");
        }
    }

}
