//2) Send Message: User will enter a message, if message is valid it will be sent,
// there is a chance the message will not be delivered due to internet
//        > User takes a message that needs to be at least 15 characters
//        > If the message is valid user will see message: “sent” and “not sent” if the message was not valid
//        > If message was sent there is a 50 % chance the message will not be delivered.
//        >> If the message is delivered user will see message: “ delivered”
//        HINT: use random number for random chance to send
//

package strings;

import java.util.Random;
import java.util.Scanner;

public class MessageSendOrNot {
    public static void main ( String[] args ) {

        Random random = new Random ();
        int generated = random.nextInt ( 2 );
        Scanner input = new Scanner ( System.in );
        System.out.println ( " Enter a message : " );
        String message = input.nextLine ();

        if (message.length () > 14) {
            System.out.println ( " Sent !" );


            if (generated == 1) {   //if (random.nextBoolean();   you can do it with boolean
                System.out.println ( "Delivered!" );
        } else {
            System.out.println ( " Undelivered!" );
        }
            } else {
                System.out.println ( " Message should be at least 15 character " );
                System.out.println ( " Not sent! " );
            }
            System.out.println ( " Random number was " + generated );

        }
    }