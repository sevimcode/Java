package cybertekvariables;

public class StringPrintingExample {

    public static void main ( String [] args )
    {
        int numberOfApples = 10;
        int numberOfOranges = 5;

        System.out.println ( "apples  :" + numberOfApples );
        System.out.println ( "oranges :" + numberOfOranges );

        numberOfApples = 8;
        numberOfOranges = numberOfApples;

        System.out.println ( "apples after  :" + numberOfApples );
        System.out.println ( "oranges after  :" + numberOfOranges );

    }
}
