package forloops;

import java.util.Scanner;

public class IgnorecasePassword {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
    String password = "secret478";



            for (; ; ) {
                    System.out.println ( "Enter your password  :" );
                    String userpass = input.nextLine ();

                    if (userpass.equalsIgnoreCase ( password )) {
                    System.out.println ( "welcome to your account!" );
                    break;
                    }


                    }
                    }}