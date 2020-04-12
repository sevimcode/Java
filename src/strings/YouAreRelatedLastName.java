//8) User will be asked to enter two full names ( first and last).
//        You will determine if the two entered people are relatives by comparing their last names.


package strings;



import java.util.Scanner;

public class YouAreRelatedLastName {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "what is your name :" );
        String person1 = input.nextLine ();
        System.out.println ( "what is your name :" );
        String person2 = input.nextLine ();

        int find = person1.indexOf (' ');
        String comparison1 = person1.substring (find+1);

        int find1 = person2.indexOf (' ');
        String comparison2 = person2.substring ( find1 +1);

        if (comparison1.equals(comparison2)) {
            System.out.println ( "you are related" );
        } else
        {
            System.out.println (" you are not related");

    }
}}