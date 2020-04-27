package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWeather = true;
        // true
        if(coldWeather){
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

        }

        boolean coronaDetected = false;
        // false
        if(coronaDetected){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("==========================");

        int a = 100;
        boolean evenNumber = a % 2 == 0; // if a number can be divided by 2 without the remainder
        boolean oddNumber = a % 2 != 0; // if a number cannot be divided by 2 evenly

            if (evenNumber) {
                System.out.println(a + " is even number");
            }

            if (!evenNumber){ // if the number is not even number, then it must be odd
                System.out.println(a + " is odd number");
            }
            //  if (oddNumber){
        //                System.out.println(a + " is odd number");
        //            }


    }

}
