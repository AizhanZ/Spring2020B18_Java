package day21_MultiDimensionalArrays;

public class Zoo {

    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[][] zoo = {wildAnimals, birds};
        //                      0        1

        String kfc = zoo[1][3]; //  "Chicken"
        System.out.println(kfc);

        System.out.println("==============================");

        for( String eachBirds : zoo[1] ){//4 times
            if(eachBirds.equals("chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }

        System.out.println("==============================");
        for( String each : zoo[0] ){// will be executed 5 times
            if(each.equals("Turtle")){
                continue;
            }
            System.out.println(each);


        }
    }

}
