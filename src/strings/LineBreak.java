
//1) Credentials: Given two existing data: user and pass of “test” and “test123”
//        Write a program that asks users to enter a username and password.
//        —> If the username and password match print: “ Welcome!”
//        —> If username is incorrect print: “invalid username” and don’t ask for the password
//        —> If password is incorrect print: “invalid password”


package strings;

import java.util.Scanner;

public class LineBreak {

    public static void main ( String[] args ) {


        String user = "test";
        String pass = "test123";

        Scanner input = new Scanner ( System.in );
        System.out.println ( " username :" );
        String username = input.nextLine ();
   //     int age = input.nextInt ();  if you get integer after that always break the line right after it incase
   //     input.nextLine (); incase you will ask string from console

        if (user.equals ( username )) {
            System.out.println ( " password :" );
            String password = input.nextLine ();

            if (pass.equals ( password )) {
                System.out.println ( " welcome!" );

            } else {
                System.out.println ( "invalid password " );
            }

        }

        else { System.out.println ( " invalid username" );

    }
}
}