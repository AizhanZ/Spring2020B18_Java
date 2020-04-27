package Replit;
/*
a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

also if input is "soda" output 2.0 (do this with another if)

for example:

in = "burger"

output: 10.0

in = "chicken "

output: 10.0

in = "soda"

output: 2.0

hint or operator in java is  ||
 */
import java.util.Scanner;

public class R45_BurgerOrChicken {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float mealPrice = 10;
        float sodaPrice = 2;

        String in = s.next();

        if(in.equals("burger") || in.equals("chicken")){
            System.out.println(mealPrice);
        };
        if(in.equals("soda")){
            System.out.println(sodaPrice);
        }
        /* Muhtar's code
        String in = s.next();
        //your code here
        double price = 10.0;
        double soda = 2.0;
        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(price);
        }

        if (in.equals("soda")) {
            System.out.println(soda);
        }
         */
    }

}
