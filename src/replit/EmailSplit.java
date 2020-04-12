//Given a String variable email, write code using split method to print email id and domain in separate lines.
//
//        Example:
//        email -> info@cybertekschool.com
//Print:
//        Email id: info
//        Email domain: cybertekschool.com
//

package replit;

import java.util.Scanner;

public class EmailSplit {

    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        String email = input.nextLine ( );
        int count=0;
        int length = email.length ( );
        char[] emailchar = new char[ length ];
        for (int i = 0;i < length;i++) {
            emailchar[ i ] = email.charAt (i);
        }

        for (int j = 0;j < length;j++) {

         if (emailchar[j]=='@'){
             count++;}}

         if (count!=1){
             System.out.println ("invalid email" );
         } else{

            String name = email.substring (0,email.indexOf ('@'));
        String domain = email.substring (email.indexOf ('@')+1);
        System.out.println ("Email id: " +name );
        System.out.println ("Email domain: " + domain );}



    }
    }







