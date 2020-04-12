package exceptionsexamples;

import java.io.File;
import java.io.IOException;

public class ThrowsExceptionEx{


    public static void main( String[] args ) throws InterruptedException, IOException { // it is not handled exception but keep program running
        try {
            Thread.sleep ( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        //   Dog.bark (); // throws an exception we put it explicitly in the code in Dog class
        System.out.println ( 5 );


        Dog dog = new Dog ();

        try {
            dog.setAge (37);    //this method throws exception we need to handle you can generate with surround try catch
        } catch (Exception e) {
            e.printStackTrace ();
        }
        System.out.println (dog.age);


        File file = new File ( "" );


    }
}