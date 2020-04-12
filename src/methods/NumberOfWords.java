//Create a void method name countWords that will accept a String as an argument. Print the following:
//        “The number of words in the sentence is: numberOfWords”
package methods;


import java.util.Scanner;

public class NumberOfWords{


    public static void main(String[] args){
        Scanner input = new Scanner ( System.in );
        System.out.println ( " enter your sentence : " );
        String str = input.nextLine ();
        numberWords(str);

    }
    public static void numberWords(String str){

        String [] arr = str.trim().split(" ");
        System.out.println( "The number of words in the sentence is:"+ arr.length );

    }


}
