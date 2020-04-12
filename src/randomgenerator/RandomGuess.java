// Guess Number: User is asked to guess a number from 1 to 10
//        Write a program that generates a random number and takes a guess from the user.
//        > If user guesses correct number they should see “ Congrats you guessed right”
//        > If user guess is more than the random number they should see: “your guess is too high”
//        > If user guess is less than the random number they should see “your guess it t
// computer will generate number and you will guess the number
package randomgenerator;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {


    public static void main ( String[] args ) {


        Random random = new Random ();
        int generated = random.nextInt ( 10 );
        generated++;  // this is how we get the range 1 to 10

        Scanner input = new Scanner ( System.in );
        System.out.println ( "Put your number" );
        int guess = input.nextInt ();
        boolean valid = false;

            if (!valid){
            System.out.println ( "invalid number" );
            valid= false;}
            else if (guess == generated) {
                System.out.println ( "Congrats you guessed right!" );
                valid =true;}
             else if (guess > generated) {
                System.out.println ( "Your guess is too high" );
                valid = true;}
             else if (guess < generated) {
                System.out.println ( "Your guess it too low" );
                valid = true;}
             else if (valid)
            {
            System.out.println ( "Generated number was " + generated );
            }
        }
    }



