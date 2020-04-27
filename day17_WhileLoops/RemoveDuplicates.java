package day17_WhileLoops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "Java is fun, Java is cool";//how many a's in java

        int count = 0;//2

        while(str.contains("Java")){
            count++;
            str = str.replaceFirst("Java", "");

        }

        System.out.println(count);

    }

}
