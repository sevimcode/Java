package ifElseStatements;

import java.util.Scanner;

public class PasswordValidation {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        String name = "sevim";
        String pass = "1234";

        System.out.println ( " username :" );
        String username = input.nextLine ();


        if (username.equals ( name ))
        {
            System.out.println ( " password :" );
            String password = input.nextLine ();
            if (password.equals ( pass )) {
                System.out.println ( "login successful!!" );
            } else {
                System.out.println ( "wrong password" ); }
        }

         else
            {
                System.out.println ( "invalid username" );
            }
        }

    }

