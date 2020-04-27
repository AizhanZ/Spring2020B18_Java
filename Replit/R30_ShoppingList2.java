package Replit;
/*
In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your
classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count,
price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)

-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)

-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)

-calculate totalPrice for all items only if the item's count is more than 0!

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"

 */
import java.util.Scanner;

public class R30_ShoppingList2 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE: It's all Muhtar's code I didn't do anything
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");

        String item1 = input.next();
        int count1 = input.nextInt();
        double price1 = input.nextDouble();
        double totalPrice1 = count1 * price1;
        System.out.println("Item1 is " + item1 + ", count is " + count1 + ", price is " + price1);

        String item2 = input.next();
        int count2 = input.nextInt();
        double price2 = input.nextDouble();
        double totalPrice2 = count2 * price2;
        System.out.println("Item2 is " + item2 + ", count is " + count2 + ", price is " + price2);

        String item3 = input.next();
        int count3 = input.nextInt();
        double price3 = input.nextDouble();
        double totalPrice3 = count3 * price3;
        System.out.println("Item3 is " + item3 + ", count is " + count3 + ", price is " + price3);

        String report = "";
        double totalPrice;

        if (count1 >= 0){
            report = ("Item2: " + item2 + " Price: " + totalPrice2 + ", Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice2 + totalPrice3;
        } else if (count2 <= 0) {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice1 + totalPrice3;
        } else if (count3 <= 0) {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item2: " + item2 + " Price: " + totalPrice2);
            totalPrice = totalPrice2 + totalPrice1;
        } else {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item2: " + item2 + " Price: " + totalPrice2 + " Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice1 + totalPrice2 + totalPrice3;
        }

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);
    }


}
