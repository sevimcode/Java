package scanners;

import java.util.Scanner;

public class MonthDayYearInputs {


    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "month  :" );
        int month = input.nextInt ();
        System.out.println ( "day :" );
        int day = input.nextInt ();
        System.out.println ( "year:" );
        int year = input.nextInt ();

        String result = month + "/" + day + "/" + year;

        System.out.println ( result );

        year = year + 5;
        day = day - 1;
        String result2 = month + "/" + day + "/" + year;

        System.out.println (result2);


    }
}