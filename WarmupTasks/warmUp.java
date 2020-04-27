package WarmupTasks;

public class warmUp {

    public static void main(String[] args) {

       int age = 100;

       if(age < 1){
           System.out.println("infant");
       } else if(age >= 3 && age <= 5){
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 9){
           System.out.println("Kid");
       } else if (age >= 10 && age <= 12){
           System.out.println("Pre-Teen");
       } else if (age >= 13 && age <= 17){
           System.out.println("Young Adult");
       } else if (age >= 21 && age <= 39){
           System.out.println("Adult");
       } else if (age >= 40 && age <= 49){
           System.out.println("Young Middle-Aged Adult");
       } else if (age >= 50 && age <= 54){
           System.out.println("Middle-Aged Adult");
       } else if (age >= 55 && age <= 64){
           System.out.println("Very Young Senior Citizen");
       } else if (age >= 65 && age <= 74){
           System.out.println("Young Senior Citizen");
       } else if (age >= 75 && age <= 84){
           System.out.println("Senior Citizen");
       } else if (age >= 85){
           System.out.println("Old Senior Citizen");
       } else if (age >= 120 && age <= 0){
           System.out.println("Invalid Entry");
       }

    }

}
