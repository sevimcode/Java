package ifElseStatements;

import java.util.Scanner;

public class findMaxnumber {


    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( " give 3 numbers :" );
        int num1 = input.nextInt ();
        int num2 = input.nextInt ();
        int num3 = input.nextInt ();

        boolean compare1 = num1 > num2 && num1 > num3;
        boolean compare2 = num2 > num3 && num2 > num1;
        boolean compare3 = num3 > num1 && num3 > num2;
        boolean compare = num1 == num2 && num2 == num3;

        if (compare3)
            System.out.println (num3 + " is the maximum number");

        else if (compare2)
            System.out.println (num2 + " is the maximum number");

        else if (compare1)
            System.out.println (num1 + " is the maximum number");

        else if (compare)
                System.out.println (" All of them equal");

    }
}