
//      Vending machine change. Write a program that will ask used to enter a whole number from 1 to 99.
//        User will get back the amount of quarters, dimes, nickels, and pennies that are needed to equal to the provided number.
//        > input Enter your change68 > output
//        Your change of 68 was converted to:quarters: 2dimes: 1nickels: 1pennies: 3
//


package scanners;

import java.util.Scanner;

public class VendingMachine

{

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println (" Total pennies 1 - 99 : ");
        int total = input.nextInt ();
        int quarter = total / 25;
        int reminder = total % 25;
        int dimes = reminder / 10;
        int reminder2 = reminder % 10;
        int nickels = reminder2 / 5;
        int reminder3 = reminder2 % 5;
        int pennies = reminder3;
        System.out.println (" your " + total + " amount pennies makes  " + quarter + " quarter " + dimes + " dimes " + nickels +
                " nickels " + pennies + " pennies");


    }

}




