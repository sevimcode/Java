
//      Write a program what asks the user to enter two decimal numbers.
//      Take these two numbers and perform all the mathematical operations (+,-, *, /, %) on them.
//       Print all the results.
//       > input 3.5, 6 > output: Addition: 9.5 etc for Subtraction, Multiplication, Division, Remainder


package scanners;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Calculate1 {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( " First decimal :" );
        double numberOne = input.nextDouble ();
        System.out.println ( " Second decimal : " );
        double numberTwo = input.nextDouble ();

        double result = numberOne + numberTwo;
        NumberFormat formatter = new DecimalFormat("##.000");
        System.out.println();
        System.out.println ("addition  :" + (formatter.format(result)));

        result = numberOne - numberTwo;
        System.out.println ("subtraction :" + (formatter.format(result)));

        result = numberOne / numberTwo;
        System.out.println ("division  :" + (formatter.format(result)));

        result = numberOne * numberTwo;
        System.out.println ("multiplication : " + (formatter.format(result)));


    }
}
