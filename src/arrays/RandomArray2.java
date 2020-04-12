package arrays;

import java.util.Random;

public class RandomArray2 {


    public static void main ( String[] args ) {

        Random randomNumber = new Random(); //create new randomNumber object
        int array [] = new int [20];   // make array [] with length 20

        for (int i=0 ; i < array.length; i++)
        {
            array [i] = randomNumber.nextInt (50);

        }
        for (int i : array) //enhanced for loop fetch values from array and put it in i
        {
            System.out.println (i);
        }
    }
}
