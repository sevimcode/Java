package scanners;

import java.util.Scanner;

public class WhenRetire {
    public static void main ( String[] args ) {


        int retire = 65;
        Scanner keyboard = new Scanner ( System.in );

        System.out.println ("Input:");
        int age = keyboard.nextInt ();
        int result = retire - age;
        System.out.println (" Output : Because you are  " + age + " years old you will be retired in  " + result + " years");



    }
}
