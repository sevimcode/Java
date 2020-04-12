package cybertekvariables;

public class Operators {



    public static void main ( String[] args ) {
        double num1 = 3;
        double num2 = 5;

        int sum = (int) (num1 + num2); // i did double operation and cast it to integer

        int a = 5;
        a = a + 5;  // you can write it like a += 5 short hand operator
        // a += 5

        System.out.println (num1 / num2);
        System.out.println (num1 % num2);
        System.out.println (sum );

        int size = 323;
        int result = size % 2;
        System.out.println (result);  // if it is 1 it is odd number
    }
}
