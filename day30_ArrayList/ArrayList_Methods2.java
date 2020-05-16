package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
                list.add("A");//0
                list.add("B");//1
                list.add("C");//2

        //list.remove(1); cannot assign to boolean
        //when you pass int as an index it will not work
        //but string will pass
        String str = "B";
        boolean r1 = list.remove(str);//true

        boolean r2 = list.remove("A");//true

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

        list.clear();//[] will delete everything

        System.out.println(list);
        System.out.println(list.size());


        ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(1);//0
                list2.add(1);//1
                list2.add(2);//2
                list2.add(3);//3

        //{1,1,2,3}

        int num1 = list2.indexOf(1);//0 returns as int - assign to int
    //int assigned to Integer object == autoboxing

        System.out.println(num1);
        //index doesn't exist will give out of bounds

        int num2 = list2.indexOf(100);
        System.out.println(num2);
        //if
        //smalles index number is 0

        int num3 = list2.indexOf(3);//3
        System.out.println(num3);

    }

}
