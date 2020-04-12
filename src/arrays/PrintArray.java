package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main ( String[] args ) {


        Scanner input = new Scanner (System.in);

        System.out.println (" how many car you have? :");
        int many = input.nextInt ( );
        input.nextLine ( );


        String[] cars = new String[ many ];
        for (int i = 0;i < many;i++) {

            System.out.println (" name of your car  " + (i+1));
            cars[ i ] = input.nextLine ( );


        }


        System.out.println (Arrays.toString (cars));


    }
}