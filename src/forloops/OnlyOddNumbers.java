//Write a program that prints only odd numbers
//        from 0 - 50.
//
//        Flow:
//        1
//        3
//        5
//        7
//        ...


package forloops;

import java.util.Scanner;

public class OnlyOddNumbers {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "number :" );
        int number = input.nextInt ();

        int result =  number %2;

        if (!(result ==0) ){

        for (int i = 1; i < number; i += 2) {   //it only prints odd numbers
            System.out.println ( i );
        }}
        else
        System.out.println ("even number here"); // if it is even writes this

    }

}
//another way
//        for (int i = 0; i < 50; i += 2) {
//          if (i ==20 ){
//          break;}  when i comes to 20 it will end the loop
//        if (i%2 ==1) {  System.out.println ( i );} you are controlling the i, checking it every single number, we need for testing!
//        else { System.out.println ("even number here");}