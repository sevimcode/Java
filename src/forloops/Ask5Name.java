//Write a program that asks from 5 names from the user and print each name.
//
//        Flow:
//        Please enter name1:
//        > Adam
//        Adam
//        Please enter name2:
//        > Jamie
//        Jamie
//        Please enter name3:
//        > John
//        John




package forloops;

import java.util.Scanner;

public class Ask5Name {
    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );



        for (int i=0 ; i <5 ; i++) {
            System.out.println ( "Enter name" + ( i + 1 ) );
            String name = input.nextLine ();
            System.out.println (name);
        }

    }
}