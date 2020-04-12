//Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s).
//        If x is the third letter it should be printed. If the first and second are x, both should be ignored.


        package strings;


import java.util.Scanner;

public class Replace2 {
    public static void main ( String[] args ) {


            Scanner input = new Scanner ( System.in );
            System.out.println ( "Please enter word:" );
            String n1 = input.nextLine ();

            int length = n1.length ();
            char letter1 = n1.charAt ( 0 );
            char letter2 = n1.charAt ( 1 );
            char letter3 = n1.charAt ( 2 );
            String word1 = "";
            String word2 = "";

            if (( letter1 == 'x' ) || ( letter2 == 'x' )) {

               word1 = n1.replace ( "x", "" );

                System.out.println ( word1 );
            } else if (letter2 == 'x') {
                word2 = n1.replace ( "x", "" );
                System.out.println ( word2 );
            } else if (letter3 == 'x') {
                System.out.println ( n1 );
            }
        }
    }
