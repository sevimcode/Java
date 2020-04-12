package scanners;

import java.util.Scanner;

public class HowManyMinutes {

    public static void main ( String[] args ) {


        Scanner keyboard = new Scanner ( System.in );
        System.out.println ("Put your minutes  :");
        int minutes = keyboard.nextInt ();
        int hour = minutes / 60;
        int min = minutes % 60;
        System.out.println ("Hour : " + hour + "  Minutes :  " + min);

    }
}