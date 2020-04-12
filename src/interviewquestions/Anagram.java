package interviewquestions;

import java.util.Arrays;

public class Anagram{

    public static boolean isAnagram(String str1, String str2){

        char [] word1 = str1.toCharArray();
        char [] word2 = str2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }

    public static void main( String[] args ) {

        System.out.println(isAnagram("silent", "listen"));
    }
}
