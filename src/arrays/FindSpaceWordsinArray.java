
//9) Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
//        Go through the array and print the value if there is multiple words.

package arrays;

import java.util.Arrays;

public class FindSpaceWordsinArray {


    public static void main ( String[] args ) {


        String[] word = { "knife" , "wooden spoons" , "knife" , "cups" , "forks" , "pan" , "pot" ,
                "trash can" , "dish washer" , "dish washer" };


        for ( int i = 0 ; i < word.length ; i++ ) {

            if ( word[i].trim().contains(" ")) {
                System.out.println ( word[ i ] );
            }

        }

    }

}