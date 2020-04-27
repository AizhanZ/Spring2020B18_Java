package day12_JavaRecap;

public class Switch_Practice {

    public static void main(String[] args) {

        switch(3){
            case 1:
                System.out.println("Case 1");
                break; //exits switch statement

            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Invalid Case");
        }

        System.out.println("============================");

            int statusCode = 200;

            switch(statusCode){

                case 200:
                    System.out.println("Ok");
                    break;

                case 201:
                    System.out.println("Created");
                    break;

                case 202:
                    System.out.println("Accepted");
                    break;

                default:
                    System.out.println("Invalid Status Code");

            }

    }

}
