package day44_Exceptions;

public class try_catchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try{
            Thread.sleep(3000);
            System.out.println("try");
        } catch (InterruptedException e){
            System.out.println("catch");
        }

        System.out.println("World");
    }

}
