package day14_StringClass;

public class practice {

    public static void main(String[] args) {
        String gmail = "cybertkeschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equals(userinputGmail); // false

        if(result){
            System.out.println("Logged in");
        }
        System.out.println("========================");
        /*
        valid password MUST contain a special characters such as (!, _, $)
        valid password should not contain spaces
         */

        String PassWord = "mmasd1235";

        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("valid password");
        }

        System.out.println("========================");
        /*
        every website has "http" at the beginning of the web address
         */

        String webAddress = "amazwww.on.com";
                webAddress = webAddress.toLowerCase();

        if(webAddress.startsWith("www.")){
            // false
            System.out.println("valid");
        }
        System.out.println("========================");
        /*
        every single gmail address ends with @gmail.com
         */

        String email = "SybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */

    }
}
