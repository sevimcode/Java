package oca;

import com.sun.tools.javac.code.Lint;

public class Test{


   void readCard (int cardNo) throws Exception1 {
       System.out.println ("Reading Card");
   }

    void checkCard (int cardNo) throws RuntimeException{
        System.out.println ("Checking Card");
    }


    public static void main( String[] args ) {

        Test ex = new Test ();
        int cardNo = 12344;
        ex.checkCard ( cardNo );
      //  ex.readCard ( cardNo );

    }



} //compiler error readCard () exception needs to be caught or handled
