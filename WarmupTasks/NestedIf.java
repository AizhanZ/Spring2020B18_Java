package WarmupTasks;

public class NestedIf {

    public static void main(String[] args) {
        /*
        Warm up task:
    1. Wash your hand
    2. write a program that can display the days based on the numbers 1 ~ 7
            MUST USE NESTED IF
    3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
                DO NOT USE IF STATEMENTS
    4. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
                28 days: 2
                30 days: 4,6, 9, 11
                31 days: 1,3,5,7,8,10,12
            MUST USE NESTED IF
         */

        byte num = 1;
        String days = "";

        if(num >= 1 && num <= 7) {

            } else if(num == 1) {
            days = "Monday";
            } else if(num == 2) {
            days = "Tuesday";
            } else if(num == 3) {
            days = "Wednesday";
            } else if(num == 4) {
            days = "Thursday";
            } else if(num == 5) {
            days = "Friday";
            } else if(num == 6) {
            days = "Saturday";
            } else if(num == 7) {
            days = "Sunday";

        } else {
            days = "Invalid Entry";
        }

        System.out.println(days);

    }

}
