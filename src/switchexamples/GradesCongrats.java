
//Ask user to enter their letter grade, take it as a character. Give them back some result based on their letter grade.
//
//        a --> Excellent!
//        b --> Great!
//        c --> Okay
//        d --> You can do better
//        f --> Something needs to change
//        if none of these letter --> Not a valid letter grade
//
//        --> Bonus: Take into consideration if the user puts a capital or lower case letter. The results for a and A should be the same


package switchexamples;

import java.util.Scanner;

public class GradesCongrats {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        System.out.println ( " Put your grade :" );
        char grade = input.nextLine ().charAt(0);
        switch (grade) {
            case 'a':
            case 'A':
                System.out.println ("excellent!");
                break;

                case 'b':
            case 'B':
                System.out.println ("great!");
                    break;
            case 'c':
            case 'C':
                System.out.println ("okay!");
                break;
                case 'd':
            case 'D':
                System.out.println ("you can do better!");
                    break;
            case 'f':
            case 'F':
                System.out.println ("something needs to change!");
                break;
            default:
                System.out.println ("not valid letter grade type!");
        }
    }


}
