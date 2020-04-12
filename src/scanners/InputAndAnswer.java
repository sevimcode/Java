package scanners;

import java.util.Scanner;

public class InputAndAnswer {

    public static void main ( String[] args )
    {

        Scanner input = new Scanner (System.in);
        System.out.println ("What is your name ? :");
        String firstName = input.nextLine ();
        System.out.println ("Welcome, " + firstName + "!");
        System.out.println ("Where are you from ?:");
        String location = input.nextLine ();
        System.out.println ("Cool place!");
        System.out.println ("How old are you ?  :");
        int age = input.nextInt ();
        System.out.println ("you are so young!");


    }


}
