package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1); // false

        //boolean result2 = !(10 + 15 > 15); // false
        boolean result2 = 10 + 15 > 15; // true 25 > 15


        boolean result3 = !true == !false;
                          // false == true ==> false
        System.out.println(result3);

        boolean R1 = "Corona Virus" != "End of the world" && "Toilet paper" == "Cure";
                //                 true                   false

        boolean R2 = 10 > 15 && 15 < 13;
                //   false   && false ==> false

        boolean R3 = 'a' == 'b' - 1 && 'b' + 1 == 'c';
                //   91 == 98 -1     && 98 + 1 = 99  ==> true

        System.out.println(R3);

        // || or logic =======================================


        boolean R4 = true != false || false == !true;
                //       true      ||        true    ==> true

        System.out.println(R4);

        // boolean R5 = true != false && false == !true;
                //        true     &&      true   ==> true

        boolean R5 = true != false && !false == !true;
                //        true     &&        false  ==> false

        System.out.println(R5);

        boolean R6 = !!!false; // if odd will return opposite
                //     !! true
                //     ! false
                //      true

        System.out.println(R6); //if even number will return the same expression





    }

}
