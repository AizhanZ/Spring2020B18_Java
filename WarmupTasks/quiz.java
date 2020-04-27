package WarmupTasks;

public class quiz {

    public static void main(String[] args) {

        int num = 9;
        if(num++ == 10){
            System.out.println("hello world " + num);
        }else {
            System.out.println("hello universe " + num);
        }

        System.out.println("======================");

        int score = 0;
        if(score == 0){
            score +=50;
        }
        if(score !=0){
            score += 50;
        }
        System.out.println(score);

        System.out.println("=====================");

        char grade = 'A';
        boolean Passed = grade == 'A' || grade == 'B';
        boolean Passed2 = grade == 'C' || grade == 'D';

        if(Passed || Passed2){
            System.out.println("You've passed the exam");
        } else {
            System.out.println("You failed");
        }

        System.out.println("=====================");

        boolean A = true, B = !false;

        if(B){
            System.out.println("B");
        } else if (A) {
            System.out.println("A");
        } else  {
            System.out.println("C");
        }
        System.out.println("=====================");

        /*boolean result = true;
        if(result){
            System.out.println("it's true");
        } else {
            System.out.println("it's false");
        } else if(result){
            System.out.println("none of the above");
        }

         */
        System.out.println("=====================");
        boolean N = true, M = !N;

        if(N){
            if(M){
                System.out.println("Monday");
            }else{
                System.out.println("Tuesday");
            }
        } else {
            if (N) {
                System.out.println("Thursday");
            } else {
                System.out.println("Friday");
            }
        }
        System.out.println("=====================");

        int number = 10;
        if(--number > 10){
            System.out.println("hello cybertek "+ number);
        }else if(number == 9){
            System.out.println("hello world " + number);
        }
        System.out.println("=====================");


















    }

}
