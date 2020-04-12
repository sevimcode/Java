package scanners;

import java.util.Scanner;

public class InformationInputs

{

    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Name :");
        String name = input.nextLine ();
        System.out.println ("Gender:");
        char gender= input.nextLine().charAt(0);
        System.out.println ("Age :");
        int age = input.nextInt ();
        System.out.println ("Phone Number:");
        long phoneNumber = input.nextLong ();
        System.out.println ("GPA :");
        double gpa = input.nextDouble ();

        System.out.println ("Name : " + name);
        System.out.println ("Gender : " + gender);
        System.out.println ("Age : " + age);
        System.out.println ("Phone Number: " + phoneNumber);
        System.out.println ("gpa " + gpa);

    }

}
