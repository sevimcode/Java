package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BookChange {

    public static void main ( String[] args ) {

        Scanner input= new Scanner (System.in);
        System.out.println ("put your name of the book" ); // ask the name of the book looking for
        String lookingfor =input.nextLine ();

        String [] library = { "Lord of the Rings" , "Harry Potter" , "pirates" , "malkocoglu"};


        Arrays.sort (library); // you need to sort for binary search
       int index = Arrays.binarySearch(library, lookingfor);

        if ( index>=0 ){
            System.out.println ("which book do you want to replace with" );
            String replace =input.nextLine ();
            library[index]= replace;
            System.out.println (" book is changed" );
            System.out.println ( Arrays.toString (library ) );

        } else{
            System.out.println ("book not found" );
            System.out.println ( Arrays.toString (library ) );
            }


        }


    }





