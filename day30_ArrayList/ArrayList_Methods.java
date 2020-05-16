package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(5);//0
                list1.add(7);//2
                list1.add(8);//3

                list1.add(1, 6);//1
                //{5,7,8,6}
                //list1.add(7, 10);//index out of bounds

                list1.set(3, 9);
        System.out.println(list1);

        int[] arr = {1,2,3,4};//{1,2,3,4,5}
        arr[3] = 5;//5 will be assigned to index 3 in array

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");//{A}
        list2.add("B");//{A, B}
        list2.add(1,"C");//{A,C,B}
        list2.add(1,"D");//{A, D, C, B}
        //{A, D, C, B}
        list2.set(3, "F");//{A, D, C, F}
        list2.set(2, "E");//{A, D, E, F}

        System.out.println(list2);//{A,D,E,F}

        System.out.println("=========================");
        ArrayList<Integer> list3 = new ArrayList<>();
                list3.add(1);//0
                list3.add(2);//1
                list3.add(3);//2
                list3.add(4);//3

        //{1,2,3,4}
        //int a = 3;//will remove index number
        Integer a = 1;//2, 3, 4
        list3.remove(a); //{1,3,3}

        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
                list4.add(10);
                list4.add(20);
                list4.add(30);
                //{10, 20, 30}
        //list4.remove(20);//index out of bound
        //the number is taken as int by default, the object will be removed

        //list4.remove(1);

        Integer a2 = 20;
        boolean r1 = list4.remove(a2);//true

        System.out.println(list4);
        System.out.println(r1);


    }

}
