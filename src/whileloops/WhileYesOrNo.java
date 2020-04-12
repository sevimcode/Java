
// when the user says yes add number until saying no, prints how many yes
package whileloops;

import java.util.Scanner;

public class WhileYesOrNo {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        int count = 0;
        System.out.println ("would you like to add 1 ?");
        String answer = input.nextLine ();
        while (answer.equals ( "y" ) || answer.equals ( "yes" )){
            count++;
            System.out.println ("would you like to add 1 ?");
            answer = input.nextLine ();

        }

        System.out.println ("your number is  :"+ count);
    }
}