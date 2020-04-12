package oca;

import java.util.ArrayList;

public class Exception2{
    public static void main( String[] args ) {


        ArrayList myList = new ArrayList ();
        String myArray;
        try {
            while ( true ) {
                myList.add ("My String");  // infinite loop
            }
        } catch (RuntimeException re){
            System.out.println ("Caught runtimeexception");
        }catch (Exception e){
            System.out.println ("Caught an exception");
        }
        System.out.println ("ready to use");

    }
} // answer outofmemory exception throwns