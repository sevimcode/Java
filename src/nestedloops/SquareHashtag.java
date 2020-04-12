package nestedloops;

import java.util.Scanner;

public class SquareHashtag {

    public static void main ( String[] args ) {



        Scanner input = new Scanner(System.in);
        System.out.print("how many # for your square : " );
        int k = input.nextInt();


        for ( int i= 0; i<k; i++){

            for ( int j= 0; j<k; j++) {

             int r = j%2; // if odd prints * if it is even prints #
              if (r == 1)
                  System.out.print("*");
              else
                  System.out.print ("#");
            }



            System.out.println ();

        }


}}
