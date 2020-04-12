
//Write a program that asks from the user infinitely:
//        if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
//
//        Flow:
//        > hi
//        Hello
//        > bye
//        Good bye
//        > james
//        Good bye

package forloops;

import java.util.Scanner;

public class InfiniteAskUntilBye {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );


        for (; ; ) {
           String userinput =input.nextLine ();
            if (userinput.equals ( "hi" )) {

                System.out.println ( "Hello" );
            } else if (userinput.equals ( "bye" )){

                System.out.println ( "Good bye" );}
            else {
                System.out.println ( "bye forever" );
                break;
            }
        }


    }}




