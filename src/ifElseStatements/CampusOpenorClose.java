
//2) Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
//        > Campus is open from 8 am to 11 pm (23)
//        > If user enters a time within the open time they should see message : “open” but if the time entered is outside
//        of operating hours they should see: “ closed”
//        > If the user enters an invalid hour (negative number or more than 24 hours) they should see
//        an error message: “invalid time”



package ifElseStatements;

import java.util.Scanner;

public class CampusOpenorClose {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );

        System.out.println ( " Put your time 0-24" );
        int userTime = input.nextInt ();

        if (userTime > 0 && userTime < 25) {
            if (userTime > 7 && userTime < 24) {
                System.out.println ( " open" );
            } else {
                System.out.println ( "close" );
            }

        } else {
            System.out.println ( "invalid time" );
        }

    }
}