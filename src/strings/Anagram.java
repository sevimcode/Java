package strings;

import java.util.Arrays;

public class Anagram{

    public static void main( String[] args ) {
         isAnagram("listen", "silent");
    }


    public static boolean isAnagram( String word1, String word2){

        String[] arr1 = word1.split("");  // char [] c = word1.toCharArray();
        String[] arr2 = word2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (word1.length()!=word2.length())
            return false;

        if (Arrays.equals(arr1,arr2)){  // you can compare Arrays like this
           System.out.println("it is anagram");
           return true;
        }else{
        System.out.println("it is not anagram");
        return false;}

    }


}
