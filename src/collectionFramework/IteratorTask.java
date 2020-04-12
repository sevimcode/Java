package collectionFramework;

import sun.lwawt.macosx.CInputMethod;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.jar.JarOutputStream;

public class IteratorTask{

    public static void main( String[] args ) {
        Scanner input = new Scanner ( System.in );
        Set <Integer> numbers = new HashSet<> ();

        System.out.println ("enter 5 number");
       for (int i = 0; i<5 ; i++){
        numbers.add ( input.nextInt () );
    }
        Iterator iterator = numbers.iterator ();

       while (iterator.hasNext ()){
          int i = (int) iterator.next();
           if (i%2==1) {
               iterator.remove ();}
       }

        System.out.println (numbers);

    }
}
