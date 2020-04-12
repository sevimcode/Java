package replit;


import java.util.Scanner;

public class FindUniqueLettersinString {

    public static void main ( String[] args ) {


        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String catch1 = "";
                                    // accepts a string an prints only unique letter in the string

        for (int i = 0;i < word.length();i++) {
            if (catch1.indexOf(word.charAt(i)) == -1) {
                catch1 = catch1 + word.charAt(i);

            }
        }

        System.out.println(catch1);
    }
}