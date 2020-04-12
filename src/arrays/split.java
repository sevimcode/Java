package arrays;

import java.util.Arrays;

public class split {

    public static void main ( String[] args ) {

        String str = "Java is programming language";
        String [] regular = str.split(" ");  // we split the sentence word by word and we stored in the array takes away the spaces
        System.out.println (Arrays.toString (regular ) );//[Java, is, programming, language]

        System.out.println (regular[3] );// language space is not included
        String [] regular1 = str.split("");
        System.out.println (Arrays.toString (regular1 ) );
        //[J, a, v, a,  , i, s,  , p, r, o, g, r, a, m, m, i, n, g,  , l, a, n, g, u, a, g, e]


        char [] array = str.toCharArray (); // string turn into
        System.out.println (Arrays.toString (array) );
        //[J, a, v, a,  , i, s,  , p, r, o, g, r, a, m, m, i, n, g,  , l, a, n, g, u, a, g, e]

    }



}
