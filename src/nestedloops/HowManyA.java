package nestedloops;



import java.util.Scanner;

public class HowManyA {


   //how many times a in the word

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        String word = input.nextLine ();
        int count = 0;
        int total = 0;



        for (int i = 0; i < word.length(); i++) {

            if (word.charAt ( i ) == 'a') {
                count++;
            }
        }

           System.out.println (count + " times a in the word");


        }}