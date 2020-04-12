package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListEx{

    public static void main( String[] args ) {

        List <String> cars = new ArrayList<> ();
        cars.add ( "bmw" );
        cars.add ( "mercedes" );
        cars.add ( "toyota" );
        cars.add ( "honda" );
        cars.add ( "bmw" );  //List allows duplicates
        cars.add ( "jetta" );
        System.out.println (cars);
        System.out.println (cars.get ( 1 ));
    }




}
