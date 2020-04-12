package replit;

import java.util.Scanner;

public class ReverseStringWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        String [] sentence1 = sentence.split(" ");
        for ( int i= sentence1.length-1 ; i>-1 ; i--){
            if (i==0)
                reversed += sentence1 [i]; //fix the last part space
            else
                reversed += sentence1 [i]+" ";

        }

  //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}








