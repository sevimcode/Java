package oca;

public class hellouniverse{

    public static void main( String[] args ) {


        int aVar = 9;
        if (aVar++ < 10) { // aVar not incremented on this line
            System.out.println ( aVar + "Hello World" ); // aVar incremented on this line because of that aVar =10;
        } else {
            System.out.println ( aVar + "Hello universe" );
        }

        // prints 10Hello World

    }

}
