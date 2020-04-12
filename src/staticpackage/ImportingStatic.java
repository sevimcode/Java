package staticpackage;



//import static java.util.*;   // when you import like this it does not include static methods

import static java.util.Arrays.*; // if you import Arrays you don't have to write Arrays.

public class ImportingStatic{

    public static void main( String[] args ) {


        int [] a = {1,2,3,4,4,4};
        sort(a);  // you don't need write Arrays.   because of   import static java.util.Arrays.*;



    }



}
