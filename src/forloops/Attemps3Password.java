// it locks the account 3 attemps of password inputs

package forloops;

import java.util.Scanner;

public class Attemps3Password {




        public static void main ( String[] args ) {

            Scanner input = new Scanner ( System.in );
            String password = "secret478";



            for (int attemps =0 ;  ;attemps++ ) {
                if (attemps == 3){
                    System.out.println ("Your account is locked");
                    break;
                }
                System.out.println ( "Enter your password  :" );
                String userpass = input.nextLine ();

                if (userpass.equalsIgnoreCase ( password )) {
                    System.out.println ( "welcome to your account!" );
                    break;
                }


            }
        }}


