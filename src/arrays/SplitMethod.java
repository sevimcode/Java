package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitMethod{


    public static void countWords() {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your sentence :");

    String[] arr = input.nextLine().trim().split(" ");

        System.out.println("Words in this string is followed :" + Arrays.toString( arr));

    System.out.println("The number of words in sentence :" + arr.length);

}

    public static void main( String[] args ) {
        countWords();
    }




}
