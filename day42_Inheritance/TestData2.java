package day42_Inheritance;

import day38_Constructors.Test;

public class TestData2 extends AccessModifiers{
/*
publicVariable
protectedVariable
defaultVariable

publicMethod()

 */
    public static void main(String[] args) {

        System.out.println(TestData2.publicVariables);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);


        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.deffaultMethod();
    }

}
