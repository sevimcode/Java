package cybertekvariables;

import java.util.Scanner;

public class TemperatureConvert {

    public static void main ( String[] args ) {
        Scanner temp = new Scanner ( System.in );

        System.out.print ( "Enter your Fahrenheit degree : " );

        double temp1 = temp.nextDouble ();
        double celsius = 5 * ( temp1 - 32 ) / 9;

        System.out.println ( "Celsius degree is " + celsius );
    }


    public static class HelloWorld   // class declaration
    {
        public static void main (String[] args)  // main method
        {
            int a;
            a = 25;
            System.out.println ("Hello World!");

        }

    }
}
