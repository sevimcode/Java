package randomgenerator;

import java.util.Random;

public class RandomNumber {

    public static void main ( String[] args ) {


        Random random = new Random ();
        int number1 = random.nextInt(100);
        System.out.println (number1);
    }
}