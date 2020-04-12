/// ask how many name you will enter then create an array then print it




package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputToArray {

    public static void main ( String[] args ) {



        Scanner input = new Scanner ( System.in );

        System.out.println ( " how many name you want to create an array  :" );
        int arraysize = input.nextInt ();
        input.nextLine ();   /// you need to break line after integer you will get the string after integer


        String [] names = new String[arraysize];


        for (int i = 0; i < names.length; i++) {

            System.out.println ( " enter name :"+ (i+1 ) ); // ask use which character sequence they looking for in array

              names[i] = input.nextLine ();} // directly takes user input to array


        System.out.println ( Arrays.toString ( names ) ); // prints your array

        }


    }


