package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Decimaltobinary {

    public static void main ( String[] args ) {

        Scanner input= new Scanner(System.in);
        int decimal = input.nextInt();
        int[] binary = new int[8];



        int index = 7;
        while(decimal > 0){
            binary[index--] = decimal%2;
            decimal = decimal/2;
        }


        System.out.print (Arrays.toString(binary));
    }
}

