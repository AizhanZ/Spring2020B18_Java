/*
package day22_Arrays_Loops;
/*
3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop

public class Java_Python {

    public static void main(String[] args) {
        String sentence = "I like java and javascript";

        sentence = sentence.toLowerCase();
        int countJava = 0;//2
        int countPython = 0;

        String[] words = sentence.split(" "); // [I, like, java, and, javascript] length of this array is 5

        for( String each : words){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(countJava == countPython);
        

    }

}

 */
package day22_Arrays_Loops;
/*
3. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
			(it’s similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
 */
public class Java_Python {

    public static void main(String[] args) {
        String sentence = "I like java and javascript";

        sentence =  sentence.toLowerCase();

        int countJava = 0 ;  // 2
        int countPython =0 ;
        String[] words = sentence.split(" ");   //[I, like, java, and, javascript ]  5

        for(String each  : words){

            if(each.contains("java")){
                countJava++;
            }

            if(each.contains("python")){
                countPython++;
            }


        }
        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(countJava == countPython);



    }

}

