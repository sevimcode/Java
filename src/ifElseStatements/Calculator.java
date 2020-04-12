package ifElseStatements;

import java.util.Scanner;

public class Calculator {

    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( " put your first number" );
        double num1 = input.nextDouble ();
        System.out.println ( " put your second number" );
        double num2 = input.nextInt ();
        input.nextLine ();
        System.out.println ( "Please choose your operator / * + -" );
        String operator = input.nextLine ();
        double result = 0;
        boolean check = false;


        if (operator.equals ( "-" ))
        { result = num1 - num2;
        check = true;}
        else if (operator.equals ( "+" ))
        {result = num1 + num2;
        check = true;}
        else if (operator.equals ( "/" ))
        { result = num1 / num2;
            check = true;}
        else if (operator.equals ( "*" ))
        {result = num1 * num2;
            check = true;}


        if (!check)
            System.out.println ( " You put wrong operator!" );
            else
        System.out.println ( " Result of " + num1 + operator + num2 + " is " + result );

    }


}
