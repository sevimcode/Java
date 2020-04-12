package mondays;


import java.util.Scanner;

public class palindromefast {


    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "Enter the word:" );
        String str2 = input.next ();
        //----------------------------------------------------------

        int counter = 0;
        int length = str2.length ();
        String str3 = str2.toLowerCase ();

        for (int i = 0; i < length / 2; i++) {
            if (str3.charAt ( length - ( i + 1 ) ) == str3.charAt ( i ))
                counter++;
        }


        if (counter == length / 2) {
            System.out.println ( "Palindrome" );
        } else if (counter < length / 2 - 1) {

            System.out.println ( "Not Palindrome" );
        }


    }}











