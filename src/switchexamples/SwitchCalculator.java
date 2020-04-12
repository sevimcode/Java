package switchexamples;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.print ( "put your first number  :" );
        double num1 = input.nextDouble ();
        input.nextLine ();
        System.out.print ( "put your operator  :" );
        char operator = input.nextLine ().charAt ( 0 );
        System.out.print ( "put your first number  :" );
        double num2 = input.nextDouble ();
        double result = 0;
        boolean valid = true;
        switch (operator) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '*':
                result = num1 * num2;
                break;


            default:
                System.out.println ( "invalid operation" );
                valid = false;
                break;
        }

        if (valid) {
            System.out.println ( "" + num1 + operator + num2 + " = " + result );

        }
    }
}