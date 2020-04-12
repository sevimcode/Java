package replit;
import java.util.Scanner;

public class GuestListYesOrNo {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );

        int count = 1;
        String name = "";
        String name1 = "";
        String answer = "";


        System.out.println ( "Please enter guest name:" );
        name = input.nextLine ( );
        name1 = name1 + (" "+ name + "," );


        for ( int i = 0 ; i < count ; i++ ) {

            System.out.println ( "Do you want to enter new guest name:" );
            answer = input.nextLine ( );
            if ( answer.equals ( "no" ) ) {
                int length = name1.length();
                System.out.print ( "Guest's list:" + name1.substring(0,length-1));
                break;
            } else if ( answer.equals ( "yes" ) ){
                System.out.println ( "Please enter guest name:" );
                name = input.nextLine ( );
                name1 = name1 + (" "+ name + "," );
                count++;

            }

        }

    }
    }













