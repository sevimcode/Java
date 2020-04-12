package switchexamples;

import java.util.Scanner;

public class SwitchBabies {


    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.println ( " How many babies you have: " );
        int babies = input.nextInt ();

        switch (babies){

            case 0:
                System.out.println ("Sorry");
                break;

            case 1:
                System.out.println ("Good for you");
                break;
            case 2:
                System.out.println ("twins");
                break;
            case 3:
                System.out.println ("wow. triplets!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println (" Unbelievable " + babies + " babies!");
            default:
                System.out.println ("I don't believe you!");


        }







    }

}
