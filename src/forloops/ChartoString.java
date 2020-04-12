package forloops;

public class ChartoString {

    public static void main ( String[] args ) {


        String word = "Cybertek";


        for (int i = 0; i < word.length (); i++){
            if (word.charAt(i) == 'b'){
                String s = word.charAt(i)+""; // makes the char to a string with "" before or after
                System.out.println (s.toUpperCase ()+ " "+ i);
                continue; // if we want to uppercase B we need to skip lowercase b
            }



        }

    }
}