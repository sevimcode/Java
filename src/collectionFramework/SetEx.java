package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx{

    public static void main( String[] args ) { // set unordered and does not allow duplicates

        Set <String> cars = new HashSet<> ();
        cars.add ( "bmw" );
        cars.add ( "mercedes" );
        cars.add ( "toyota" );
        cars.add ( "honda" );
        cars.add ( "bmw" );  //List allows duplicates
        cars.add ( "jetta" );
        System.out.println (cars);

        for (String s : cars) {
            System.out.println ( s );
        }

        List <String> convertingsettolist = new ArrayList<> (cars); // cars is set
    }



}
