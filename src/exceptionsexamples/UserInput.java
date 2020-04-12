package exceptionsexamples;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput{


    public static void main( String[] args ) {
int [] arr = {1,2,3,4,5};
        int num = 0;
        Scanner input = new Scanner ( System.in );
        try {
            System.out.println ( "Enter index number " );
            int index = input.nextInt ();
            System.out.println ( "Enter number you want to add  :" );
            num = input.nextInt ();
            arr[index]=num;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ( "no such index!" );


        } catch (InputMismatchException e) {
            System.out.println ( "it is not a number" );

        }finally {
            System.out.println ( Arrays .toString ( arr ));
        }

    }




}
