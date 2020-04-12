
//Write a program to print out all Armstrong numbers between 1 and 500.
//        If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//        for example:
//        153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )



package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumberInput {


    public static void main ( String[] args ) {

        Scanner input = new Scanner (System.in);
        int iNum = input.nextInt ( );
        int length = String.valueOf (iNum).length ( ); // finding the length of the integer number
        String sNum = String.valueOf (iNum);
        int result = 0;


        int[] cNum = new int[ length ];


        for (int i = 0;i < length;i++) {

            cNum[ i ] = ( sNum.charAt (i) ) - 48;

        }
        for (int i = 0;i < length;i++) {
            result += cNum[ i ] * cNum[ i ] * cNum[ i ];}


            if (iNum == result) {

                System.out.println (iNum + "is armstrong number");
            }
        }
    }















