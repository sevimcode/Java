package switchexamples;

import java.util.Scanner;

public class NumberCases {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( " Put your number :" );
        int number = input.nextInt();

        switch (number) {  // you can have String number = ""; empty string and print it at the end outside of switch

            case 1:

                System.out.println ("one");
                break;
            case 2:
                System.out.println ("second");
                break;
            case 3:
                System.out.println ("three");
                break;
            case 4:
                System.out.println ("four");
                break;
            case 5:
                System.out.println ("five");
                break;
            default:
                System.out.println ("invalid number");
        }
        }
        }
