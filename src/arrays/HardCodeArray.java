//2) Declare and initialize double array for prices.
//        Store following prices:
//        45.99, 23.5, 11.50, 33.33, 99.99.
//        Print the values then change the last element to 112.89.
//        Print all values again


package arrays;


import java.util.Arrays;

public class HardCodeArray {


    public static void main ( String[] args ) {


        double [] num = new double[5];


        num[0] = 45.99;
        num[1] = 23.5;
        num[2] = 11.50;
        num[3] = 33.33;
        num[4] = 99.99;
        // double [] num = {45.99, 23.5, 11.50, 33.33, 99.99} // example: String [] names = { "jamie" , "bob" , "sevim"};
        // num[num.length-1] = 112.89;

        System.out.println ( num[0]  );
        System.out.println ( num[1] );
        System.out.println ( num[2]  );
        System.out.println ( num[3] );
        System.out.println ( num[4] );

        System.out.println ( Arrays.toString (num) );

        num[4] = 112.89;

        System.out.println ( num[0]  );
        System.out.println ( num[1] );
        System.out.println ( num[2]  );
        System.out.println ( num[3] );
        System.out.println ( num[4]  );

    }
}
