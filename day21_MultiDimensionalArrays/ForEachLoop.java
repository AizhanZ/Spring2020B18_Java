package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        for(int eachElement: nums){
            System.out.println(eachElement);
        }

//use it only when you don't need to provide index number
        //no index no iterator

        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for(String eachStudent : students){
            System.out.println(eachStudent);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        //Arrays.sort(arr1);//[1,2,3,4,5,6,7,8,9,10] can also use


        for(int each : arr1){
            if(each < 5){
                continue;//skips
            }
            System.out.println(each);
        }

        System.out.println("=====================");
        String sentence = "I like Java";//Java like I

        String[] words = sentence.split(" ");//[I, like, Java]

        for (String eachWord : words){//0 ~ 2
            System.out.println(eachWord);

        }
        System.out.println("======================");

        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]);
        }

    }

}
