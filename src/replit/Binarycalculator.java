package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Binarycalculator {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);


        int decimal = input.nextInt();
        int[] binary = new int[8];
        int result =0;
        int divide= 0;
        divide =decimal/2;

        if (decimal%2==1){
           binary [7]=1;}
        else
        { binary[7]=0;}

        result =decimal;


            for (int j=7 ; j>-1 ; j--){
            result = result/2 ;
            if (result%2==1){
                binary[j] = 1;}
            else{
                binary[j] = 0;}

        }


        System.out.println (Arrays.toString (binary ) );


    }
}
