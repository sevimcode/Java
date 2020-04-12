package ifElseStatements;

import java.util.Scanner;

public class EvenorOdd {
    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( " put your number" );
        int num = input.nextInt ();
        int num1 = num%2;
        if (num1 == 0){
            System.out.println (" you number even");
        }

  else
      {
            System.out.println ( " your number odd" );
        }


    }
}