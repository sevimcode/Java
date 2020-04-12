package replit;

import java.util.Scanner;

public class LongestWordinArray {




        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String[] words = new String[5];
            for(int i = 0; i < 5;  i++) {

                words[i] = input.nextLine();

            }

            //write your code below

            String biggest= "";
            for(int i=0; i<words.length ; i++){

                if (words[i].length()>=biggest.length()){
                    biggest = words[i];}}


            System.out.println(biggest);






        }

    }




