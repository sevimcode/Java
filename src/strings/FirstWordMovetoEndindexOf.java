//User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
//        > input: “Java is a fun language”
//        > output: “is a fun language Java”



        package strings;

import java.util.Scanner;

public class FirstWordMovetoEndindexOf {

    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( " put your sentence" );
        String sentence = input.nextLine ();

        int lenght = sentence.length();

        int space = sentence.indexOf (" ");
       // int space2 = sentence.indexOf (" ", space+1) // it finds second space

        System.out.println (sentence.substring((space+1),lenght) + " " + sentence.substring (0,space));

        System.out.println (sentence.substring (space+1) + " "  +sentence.substring (0,space) ); //another way to write
        //sentence.substring(space+1) it start  from this position and writes the rest

    }


}
