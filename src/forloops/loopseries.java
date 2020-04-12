package forloops;

import java.util.Scanner;

public class loopseries {

    public static void main ( String[] args ) {


    Scanner input = new Scanner ( System.in );
    System.out.println ( "Number 1:" );
    int num1 = input.nextInt ();
    System.out.println ( "Number 2:" );
    int num2 = input.nextInt ();
    int result = 0;
        for (int i=1 ; i <=num2 ; i=i*i){

         result = result + (num1*i);}

        System.out.println (result);
    }
}
