//User is asked to enter an account number. You will check if these account numbers are valid.
//        > If the account number begins with a “2” the account number should be 7 characters long
//        > If the account number begins with a “5” the account number should be 10 characters long
//        —> If the account number does not begin with a 2 or a 5 OR
//        the account number lengths do not meet the expected results print “ Invalid account number”

package strings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Equals {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( "account number :" );
        String account = input.nextLine ();
        String firstnumber = account.substring (0,1);
     boolean check1 = (firstnumber.equals("5")) &&  (account.length() == 7);
     boolean check2 = (firstnumber.equals("2")) &&  (account.length() == 10);


            if (check1 || check2)
                { System.out.println (" Account is valid");}

   else {
            System.out.println ("account is invalid"); }

}
}