package scanners;

import java.util.Scanner;
import java.lang.String;

public class Calculator {


    public static void main ( String[] args ) {
        double result = 0;
        Scanner myScanner = new Scanner (System.in);

        System.out.print ("Type your first number :");
        double firstNumber = myScanner.nextDouble ();

        System.out.print ("Type your operation + , - , * , /   :");
        String operation = myScanner.next ();

        System.out.print ("Type your second number  :");
        double secondNumber = myScanner.nextDouble ();

        if (operation.equals ("+")) {
            result = firstNumber + secondNumber;

        } else if (operation.equals ("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals ("*")) {
            result = firstNumber * secondNumber;
        } else if (operation.equals ("/")) {
            result = firstNumber / secondNumber;
        } else {

            System.out.println ("Unexpected number or operation!!");
            return;


        }
        System.out.println (firstNumber + operation + secondNumber + " = " + result);

    }
}

