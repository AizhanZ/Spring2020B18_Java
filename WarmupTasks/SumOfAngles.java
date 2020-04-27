package WarmupTasks;

public class SumOfAngles {

    public static void main(String[] args) {

        double angleA = 40;
        double angleB = 90;
        double angleC = 50;

        double sumOfAngles = 180;

        if(sumOfAngles == angleA + angleB + angleC){
            System.out.println("triangle is valid");
        } else {
            System.out.println("triangle is odd");
        }

    }

}
