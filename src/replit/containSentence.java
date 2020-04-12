package replit;

import java.util.Arrays;

public class containSentence{

    public static void main( String[] args ) {


        String[] words = { "sevim" , "murat " , " gul " , "sedat" };

        String sentence = "murat";


        sentence = sentence.trim().toLowerCase();
        String[] arr = sentence.split(" ");

        int count = 0;
        int secondCount = 0;

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);
        for (int i = 0;i < arr.length;i++) {
            if (arr[i].length()!=0){
                secondCount++;

            }


        }


        for (int i = 0;i < arr.length;i++) {

            for (int j = 0;j < words.length;j++) {
                if (arr[ i ].trim().equals(words[ j ])) {
                    count++;
                }
            }
        }
        System.out.println(count == secondCount);

    }  }