//two number from console then add them together until second number
//





        package nestedloops;

import java.util.Scanner;

public class AddUntilsecondNumber {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);
       int one = input.nextInt ();
        int two = input.nextInt ();
        int result = 0;
       int i =one;

            for ( i= one  ; i<=two ; i++){
            result = result + i;


        }

        System.out.println (result);


    }

}
