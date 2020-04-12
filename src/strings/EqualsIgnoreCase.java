//2) You have a value that hold what month it is (October). Ask the user to enter the month from the console.
//        If the user’s input matches the expected month put print true,
//        but if the input does not match the actual month print false.
//        Uppercase and lowercase letters do not matter, we only care about the value.

        package strings;



import java.util.Scanner;

public class EqualsIgnoreCase {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "Enter the month :" );
        String month = input.nextLine ();
        String october = "october";

     boolean check = month.equalsIgnoreCase("october");
     System.out.println (check);

        }

    }




