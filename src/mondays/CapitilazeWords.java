
//Given two strings of lowercase English letters, word1  and word2, perform the following operations:
//
//        Sum the lengths of word1 and word2 and print
//        Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
//
//        Sample Input:
//        hello world
//
//        Sample Output:
//        10
//        Hello World
//
//
//        Sample Input:
//        java cool
//
//        Sample Output:
//        8
//        Java Cool




package mondays;

import java.util.Scanner;

public class CapitilazeWords {


    public static void main ( String[] args ) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();

        int length = str3.length ();
        int find = str3.indexOf (' ');

        String word1 = str3.substring (1,find );
        String word2 = str3.substring (find+2 );

        String word11 = str3.substring (0,1 );
        String word22 = str3.substring (find+1,find+2 );

        System.out.println (length-1);
        System.out.println (word11.toUpperCase()+ word1+ " " + word22.toUpperCase()+word2);





    }




}
