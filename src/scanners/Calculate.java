
//

package scanners;

import java.util.Scanner;

public class Calculate


{
    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        System.out.println ("first number :" );
        int num1 = input.nextInt();
        System.out.println (" second number :");
        int num2 = input.nextInt();

        int count = 0;
        num1 += num2; // 5 += 10 > 15
        count++;


        System.out.println (" Your number is : " + num1 + " after being incremented by "+ num2  + " " +
                count + " times " );
        num1 += num2; // 5 += 10 > 25
        count++;

        System.out.println (" Your number is : " + num1 + " after being incremented by "+ num2  + " " +
                count + " times " );
        num1 += num2; // 5 += 10 > 35
        count++;

        System.out.println (" Your number is : " + num1 + " after being incremented by "+ num2  + " " +
                count + " times " );

    }

}
