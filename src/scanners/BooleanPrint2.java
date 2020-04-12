
//     Write a program that will ask user to enter two numbers.
//        Declare a boolean with the following value: numberOne == numberTwo.
//        Print the resulting boolean. > input: 4, 5>output: false
//

package scanners;

import java.util.Scanner;

public class BooleanPrint2 {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        int numberOne = input.nextInt ();
        int numberTwo = input.nextInt ();
        System.out.println (!(numberOne == numberTwo));

    }
}