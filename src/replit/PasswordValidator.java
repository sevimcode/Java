
//Ask user to enter a new password. If the password does not match any of the requirements below,
//        print a message based on what requirement it is breaking. If it does not break any requirement,
//        print ‘Password accepted’.
//        Password requirements:
//        Be a minimum of eight (8) characters in length
//        Contain at least one uppercase letter (A-Z)
//        Contain at least one lowercase letter (a-z)
//        Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
//        Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
//
//


package replit;

import java.util.Scanner;

public class PasswordValidator {
    public static void main ( String[] args ) {


        System.out.println ("Please enter word:");
        Scanner scanner = new Scanner (System.in);
        String n1 = scanner.nextLine ( );
        int length = n1.length ( );

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        if (length >= 8) {

            for (int i = 0;i < length;i++) {

                if (n1.charAt (i) >= 65 && ( n1.charAt (i) <= 90 )) {
                    counter1++;
                }

            }

            for (int a = 0;a < length;a++) {
                if (n1.charAt (a) >= 97 && ( n1.charAt (a) <= 122 )) {
                    counter2++;
                }


            }


            for (int b = 0;b < length;b++) {
                if (n1.charAt (b) >= 48 && ( n1.charAt (b) <= 57 )) {
                    counter3++;
                }

            }


            for (int c = 0;c < length;c++) {
                if (n1.charAt (c) >= 33 && ( n1.charAt (c) <= 47 )) {
                    counter4++;
                }


            }

            if (counter1 == 0 && counter2 >= 0 && counter3 >= 0 && counter4 >= 0) {
                System.out.println ("Password should contain at least 1 uppercase number");}

            else if (counter1 >= 1 && counter2 == 0 && counter3 >= 0 && counter4 >= 0) {
                System.out.println ("Password should contain at least 1 lowercase number");}

            else if (counter1 >= 1 && counter2 >= 1 && counter3 == 0 && counter4 >= 0) {
                System.out.println ("Password should contain at least 1 digit");}


            else  if (counter1 >= 1 && counter2 >= 1 && counter3 >= 1 && counter4 == 0) {
                System.out.println ("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,. ");}
            else  if (counter1 >= 1 && counter2 >= 1 && counter3 >= 1 && counter4 >= 1) {

                System.out.println ("Your password is accepted");}


        }else{

            System.out.println ("Password should contain minimum 8 characters ");
        }

    }
}
