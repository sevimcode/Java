//You have a bank account balance of 1500. You can continue to spend as long as you have money in your account.
//        Write a program that will ask the user to enter the cost of an item.
//        If your balance has enough money for that item complete the purchase and take the money out of the account.
//        If there is not enough money in your account for that item print “Card Declined get a different item”.
//        Allow continuous purchasing until the account becomes 0. When your account has a balance of 0 print “You are broke”
//

package whileloops;

import java.util.Scanner;

public class While3 {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        int balance = 1500;

        while (!( balance == 0 )) {
            System.out.println ( "Put your expense  :" );
            if (balance > 0) {
                int cost = input.nextInt ();
                balance -= cost;
                System.out.println ( "item purchased" );
            } else
                System.out.println ( "Card Declined get a different item " );

        }
            System.out.println ( "You are broke!" );
        }


    }
