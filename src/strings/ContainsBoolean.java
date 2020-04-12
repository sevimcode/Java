package strings;

public class ContainsBoolean {

    public static void main ( String[] args ) {

        String word = "java";
        char c = word.charAt ( 0 ); // give me the character in position 0
        System.out.println (c);

      String s = "java ";
      String s1 =" java";
      boolean check = s1.contains(s); // not matching
        System.out.println (check);
        String s2 = "java";
        String s3 ="java";
        boolean check1 = s2.contains(s3); // not matching
        System.out.println (check1);
    }


}
