package day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            if(i == 3){//wil print only 2 times
                break;
            }
            System.out.println("Hello World");
            //if(i == 3){//wil print only 2 times
            //                break; will print 3 times
        }
        System.out.println("======================");
        for(char i = 'a'; i <= 'z'; i++){

            if(i == 'd'){//will print only till d
                break;
            }

            System.out.println(i);

        }
    }


}
