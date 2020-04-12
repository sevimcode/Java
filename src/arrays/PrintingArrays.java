package arrays;

import java.util.Arrays;

public class PrintingArrays {


    public static void main ( String[] args ) {

               String[] names = new String[3];
        System.out.println ( Arrays.toString ( names ) );// prints [null, null, null]

        names[0] = "jamie";
        names[1] = "boBBBB";
        names[2] = "joe";

        System.out.println ( Arrays.toString ( names ) ); //prints jamie, bob, joe]

        //   if your values does not have value you will get null.pointerexeption

        names[1] = names[1].substring ( 0, 1 ).toUpperCase () + names[1].substring ( 1 ).toLowerCase ();
        System.out.println ( names[1] ); //makes first letter uppescase makes others lowercase
        System.out.println ( names.length );

        for (int i = 0; i < names.length; i++) {
            System.out.println ( " name : " + names[i] );
        }



    }



}
