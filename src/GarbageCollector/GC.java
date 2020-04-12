package GarbageCollector;

import finalpackage.Bag;

public class GC{

    public static void main( String[] args ) {

       Bag bag = new Bag(); // this bag object will be collected by Garbage collector
        Bag bag1 = new Bag();

        bag = bag1; // bag pointing to bag1 object not pointing to bag object anymore

        System.out.println(" hey what");
      // you can call garbage collector
        System.gc();
        System.out.println("end of program");
    }



}
