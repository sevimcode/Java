package replit;


import java.util.Arrays;
import java.util.Scanner;

public class printUniqueCharacters {

    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        String word = input.nextLine ( );
        int count = 0;
        int total = 0;
        int length = word.length ( );
        char[] chars = new char[ length];

        for (int i = 0;i < length ;i++) {
            chars[ i ] = word.charAt (i);

        }


        for (int a = 0;a < length ;a++) {
            for (int b = 1;b < length ;b++) {
               if (b == a)
                   continue;
                if (chars[ a ] == chars[ b ]) {
                    chars[ b ] = '0';

                }
            }
        }

        for (int j = 0;j < length;j++) {
            if (chars[ j ] != '0') {

                System.out.print(chars[j] );


            }  }


    }
}






