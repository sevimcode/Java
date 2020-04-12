//keep asking word and reverse them

package forloops;

import java.util.Scanner;

public class InfiniteReverseWord {

    public static void main ( String[] args ) {

       //String rev = "";  // storing chars to a string
        Scanner input = new Scanner ( System.in );

       for (; ;){
           System.out.println ( "Please enter word:" );
           String n1 = input.nextLine ();
           int length =n1.length();
        for (int i = length-1 ; i>= 0; i--){
            char c = n1.charAt ( i );  //rev += n1.charAt(i); storing chars to a string
            System.out.print (""+c);

        }
           System.out.println ();
       }


    }
}