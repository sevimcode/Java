//4) You have a String with the following value:
//        -> “We will have a picnic when the weather gets nicer”
//        First print the given sentence. Then the user is asked to enter the following:
//        the set of characters from the sentence they want to change, and
//        the set of characters that will show up in place of the ones which were removed. Print the new sentence.
//        > input: “w” , “La”
//        > output: “We Laill have a picnic Lahen the Laeather gets nicer”





package strings;

import java.util.Scanner;

public class Replace {
    public static void main ( String[] args ) {

        String sentence = "We will have a picnic when the weather gets nicer";
        System.out.println (sentence);
        Scanner input = new Scanner ( System.in );
        System.out.println ( "put your characters to be removed from sentence:" );
        String str = input.nextLine ();
        System.out.println ( "put your characters to be set to your sentence:" );
        String str2 = input.nextLine ();


        System.out.println (sentence.replace (str,str2 ));


    }


}
