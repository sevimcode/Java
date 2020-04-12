
//Create a method that will generate a random int array.
//        The method takes the size of the array and the bound of the random numbers. Return the random array



package methods;



import java.util.Arrays;
import java.util.Random;

public class RandomArrayMethod{

    public static int [] randomArray (int size , int bound){
        int a =0;
        int [] array = new int[size] ;
        Random random = new Random ();

        for  (int i = 0; i<size; i++) {
            int generated = random.nextInt (bound );
           array[i] = generated;

       }

          return array;

       }

    public static void main(String[] args){

        System.out.println(Arrays.toString(randomArray(3, 50)));

    }








    }







