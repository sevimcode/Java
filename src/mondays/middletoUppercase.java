//Given a String, str , perform the following conditional actions:
//
//        Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
//        Convert str to all lower characters
//        If number of character is odd convert middle character Upper case
//        If number of character is even convert middle two character Upper case (ex: name -> nAMe)
//
//
//        Sample Input:
//        apple
//        Sample Output:
//        apPle
//
//        Sample Input:
//        BANANA
//        Sample Output:
//        baNAna
//
//        Sample Input:
//        xy
//        Sample Output:
//        Invalid enter
//



package mondays;

import java.util.Scanner;

public class middletoUppercase {
    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println ( "Enter word:" );
        String str2 = input.nextLine ();

        int length = str2.length();

        if (str2.length() < 3 || str2.length() > 100) {
            System.out.println("Invalid enter");}


       else if (length%2 == 1){
            str2 = str2.toLowerCase ();
            String begin = str2.substring ( 0,length/2 );
            System.out.println (begin);
            String middle = str2.substring(length/2, length/2+1);
            System.out.println (middle);
            String end= str2.substring ( length/2+1 );
            System.out.println (end);


            System.out.println (begin + middle.toUpperCase()+end);
        }
       else if(length%2 == 0)
        {   str2 = str2.toLowerCase ();
            String begin = str2.substring ( 0,length/2-1);
            String middle = str2.substring(length/2-1,length/2+1);
            String end= str2.substring ( length/2+1 );


            System.out.println (begin + middle.toUpperCase()+end);
        }

    }


    }
