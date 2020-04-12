package stringbuilder;

public class Palindrome{

    public static void palindrome( String word ) {

        StringBuilder sb = new StringBuilder(word);

        sb.reverse();
       if (word.equals(sb.toString()))  // you can not compare word . equals sb.reverse();
            // you can not compare StringBuilder object with String that' why you need to use toString()

     //  if (sb.toString().equals(word))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }
}