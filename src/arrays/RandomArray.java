// create an array with random numbers 50 random number in 1-100 in range


package arrays;



import java.util.Arrays;
import java.util.Random;

public class RandomArray {


    public static void main ( String[] args ) {


        Random random = new Random ();


        int [] numbers = new int[50]; // how many number we will have in array


        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = random.nextInt ( 100 ) ;} // range of the generated number from random class



        System.out.println ( Arrays.toString ( numbers ) );
    }




}



