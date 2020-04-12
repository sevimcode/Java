package collectionFramework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratotTask2{

    public static void main( String[] args ) {


        Set<String> set1 = new HashSet<> ();
        Set<String> set2 = new HashSet<> ();
        //  Collections.addAll (set1, "red", "blue" ,"yellow"); another way to add colors
        set1.add ( "red" );
        set1.add ( "green" );
        set1.add ( "black" );
        set1.add ( "white" );

        set1.add ( "red" );
        set1.add ( "yellow" );
        set1.add ( "white" );
        set1.add ( "pink" );


        String sameColors = "";

        for (String color : set1) {
            if (set2.contains ( color )) {
                sameColors += color + " ";
            }
        }

        System.out.println (sameColors);
        System.out.println ();
        System.out.println (set1);
        System.out.println (set2);
    }

}