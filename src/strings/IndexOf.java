
//1) You have a String with the following value:
//        -> “Cybertek is located in Des Plaines”
//        The user is asked to enter a part of the string they are looking for.
//        Find the position of the String the user is looking for and print it.
//        Ex:
//        > Input: “located”
//        > Output: 12
//


        package strings;

import java.util.Scanner;

public class IndexOf {

    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( " Give your sentence  :" );
        String sentence = input.nextLine ();
        System.out.println ( " What you looking for : " );
        String looking =input.nextLine ();

        int number = sentence.indexOf ( looking );
        System.out.println (number );


    }




}
