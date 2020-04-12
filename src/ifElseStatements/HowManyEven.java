package ifElseStatements;


import java.util.Scanner;

public class HowManyEven {


    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( " Put your 5 numbers :" );
        int num1 = input.nextInt ();
        int num2 = input.nextInt ();
        int num3 = input.nextInt ();
        int num4 = input.nextInt ();
        int num5 = input.nextInt ();
        int count1 = 0;
        int count2 = 0;

        if (num1 % 2 == 0) {
            count1++;
        } else
            count2++;
        if (num2 % 2 == 0) {
            count1++;
        } else
            count2++;
        if (num3 % 2 == 0) {
            count1++;
        } else
            count2++;
        if (num4 % 2 == 0) {
            count1++;
        } else
            count2++;
        if (num5 % 2 == 0) {
            count1++;
        } else
            count2++;

        System.out.println (" You put " + count1 + " even number");
        System.out.println (" You put " + count2 + " odd number");

    }




}
