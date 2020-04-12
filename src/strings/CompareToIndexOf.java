package strings;

public class CompareToIndexOf {

    public static void main ( String[] args ) {
        String word = ("Java is fun");
        System.out.println (word.substring ( 2,6 )); // prints "va"

        String word1 = ("JaVa");
        String fixed = (word1.substring ( 0,1 ).toUpperCase ()+ word1.substring ( 1 ).toLowerCase ());
        //takes first letter and make it uppercase then writes rest of it with lowercase
        System.out.println (fixed);

        String word3= ("Kevin fell from his bike");
        int from = word3.indexOf ( "from" );
        String output = word3.substring ( 0,from );
        System.out.println (output);  // /output: " Kevin fell" does not include "f"
        System.out.println (word3.substring ( from )); // output: "from his bike"

    String str = "Today is a nice day";
    boolean check = str.startsWith ( "Today" );
        System.out.println (check); // output : true
        System.out.println (!str.endsWith ( "day" )); // you can put ! not in front of the methods


        String first = "Java";
        String second = "Javafun";
        String third = "5Java";
        System.out.println (first.compareTo(second)); //positive
        System.out.println (second.compareTo(first)); //positive
        System.out.println (first.compareTo(third));//positive
        System.out.println (second.compareTo(third));//positive



    }


}
