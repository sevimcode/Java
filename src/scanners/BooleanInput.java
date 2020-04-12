


package scanners;

import java.util.Scanner;

public class BooleanInput {

    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        int one = input.nextInt ();
        int two = input.nextInt ();
        boolean b = one > two ;  // compares int values
        System.out.println (b);  // if one > two is true  opposite false

        boolean check = input.nextBoolean (); // when you write true to console
        System.out.println (!check);  // out put is false



    }
}
