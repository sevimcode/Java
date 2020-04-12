package oca;

import javax.jnlp.IntegrationService;

public class CastingEx{

    public static void main( String[] args ) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; // line n1
  //      String s4 = (String) (s3 * s2); // line n2 // inconvertable types long to string
  //      System.out.println ("sum is " + s4);

    }

   //
    // Compilation fail at line n2
}
