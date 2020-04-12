package whileloops;

import java.util.Scanner;

public class DowhileYesOrNo {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        int count = -1;
        String answer= "";
        do {
            count++;
            System.out.println ("would you like to add 1 ?");
             answer = input.nextLine ();}

        while(answer.equals( "y" ));

        System.out.println ("your number is  :"+ count);
    }
}




