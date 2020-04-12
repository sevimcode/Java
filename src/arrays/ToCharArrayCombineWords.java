package arrays;

import java.util.Scanner;

public class ToCharArrayCombineWords
{



        public static void main(String[] args)
        {
           Scanner input = new Scanner (System.in);
            System.out.println ("first name ?:");
           String firstName = input.nextLine ();
            System.out.println ("second name ?:");
           String secondName = input.nextLine ();

            int length1 = firstName.length();


            char chars1 [] = firstName.toCharArray();
            char chars2 [] = secondName.toCharArray();

            if (chars1[length1 -1] == chars2[0])
            {

                int i = 0;
                for (i = 0; i < (length1 - 1) ; i++)
                    System.out.print ( chars1[i]);
                System.out.print ( secondName);

            }
            else

            System.out.println( firstName + " " + secondName );
        }
    }


