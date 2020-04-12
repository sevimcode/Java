//3) User is asked to enter their name. You will check if it is a cool name.
//        > If the name begins with an ‘a’ or a ‘z’ print
//        “Your name is cool” > Otherwise print “Sorry not a cool name”

        package strings;

import java.util.Scanner;

public class StartWith {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "Enter your name :" );
        String name = input.nextLine (); // String name = input.nextLine ().toLowerCase(); you can change the character at the beginning
       if (name.startsWith ( "a" ) ||name.startsWith ( "z" ) ){
           System.out.println ("your name is cool!");
       }
       else
           System.out.println ("sorry not cool name!");
    }




}
