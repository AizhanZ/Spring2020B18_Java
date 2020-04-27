package day15_ForLoop;

public class reverse {
    /*
    2. Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"
     */

    public static void main(String[] args) {
        String str = "Java"; //avaj
                //    0123

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);//in order to get string not char need to add "" empty string otherwise will return char

        String reverse2 = str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);

        System.out.println(reverse1);
        System.out.println(reverse2);



    }

}
