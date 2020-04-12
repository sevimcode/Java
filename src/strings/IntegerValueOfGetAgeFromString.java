//User enters a sentence like this:
//        > “I am x years old”
//        We want to take their age and change it. Add 5 to their age and print: “In 5 years you will be: newAge years old”
//        > input: “I am 20 years old”
//        > output: In 5 years you will be 25 years old
//

package strings;

import java.util.Scanner;

public class IntegerValueOfGetAgeFromString {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( "put I am .. years old" );
        String sentence = input.nextLine ();
        int am = sentence.indexOf ( "am" );
        int years = sentence.indexOf(" years");
        String age = sentence.substring ( (am+3),years );
        int ageNum = Integer.valueOf ( age );
        int result = ageNum + 5;
        System.out.println ("in 5 years you will be " + result + " years old");




    }
}