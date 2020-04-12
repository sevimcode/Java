 //computer will generate random number 0-26
 // Write a program that will generate a random uppercase letter. Print the letter.
package randomgenerator;

import java.util.Random;


public class RandomUpperCaseLetter {


    public static void main ( String[] args ) {

        Random myrandom = new Random ();
        int number = myrandom.nextInt (26); // ascii uppercase
        number += 65;

        char letter = (char)(number);
        System.out.println ("my number is " + number) ;
        System.out.println ("your letter is " + letter) ;
    }
}