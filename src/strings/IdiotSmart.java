
//7) User is asked to enter a message to send.
//        You will check if the message contains any of these bad words: “idiot, dumb, stupid”
//        > if any bad words are in the message change them to “smart” and print “your message was changed:”
//        and then print the new message in the next line.
//        > if the message had no bad words print “Your message was not changed:”
//        and then print the original message in the next line.


package strings;

import java.util.Scanner;

public class IdiotSmart {
    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( "what is your message :" );
        String message = input.nextLine ();
        String checked = message;

            checked = checked.replace ( "idiot", "smart" );
            checked = checked.replace ( "dumb", "smart" );
            checked = checked.replace ( "stupid", "smart" );

    if (message.contains ( "idiot" ) || message.contains ( "dumb" )||message.contains ( "stupid" ))
    {

        System.out.println ( "your message is changed" );
        System.out.println ( checked );
    }
        else
            System.out.println ("Your message was not changed");


    }}
