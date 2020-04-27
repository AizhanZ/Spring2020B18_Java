package day21_MultiDimensionalArrays;
/*
 given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
public class Emails {

    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String EachEmail : emails) {
            /*
            if (!EachEmail.endsWith("@gmail.com")) {
                System.out.println(EachEmail);
            }
             */
            if(EachEmail.endsWith("@gmail.com")){//if we use EAchEmail.contains (will give true) still prints with @gmail.com
                continue;//skips?
            }
            System.out.println(EachEmail);
        }

    }

}
