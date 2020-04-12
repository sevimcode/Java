//6) You have a car garage with these car brands. You will check the cars and print the following messages:
//        > If the garage is empty print “No cars in your garage”
//        > If you have a Toyota or Nissan print “There is a Japanese car in your garage”
//        > If you have a BMW print “There is a German car in your garage”
//        > If you have a Maserati print “There is an Italian car in your garage”
//        > If you have a Jaguar print “There is a British car in your garage” —>
//        If the garage does not have a car of that type, print “No x cars”
//
//

        package strings;

import java.util.Scanner;

public class Contains {
    public static void main ( String[] args ) {



        String car ="Toyota, Nissan, BMW";
        if ( car.contains ("" )){
            System.out.println ( "no cars in your garage" );
        if (car.contains ( "Toyota" ) ||car.contains ( "Nissan" ) )
            System.out.println ( "japanese cars in your garage" );
        if (car.contains ( "BMW" ))
            System.out.println ( "german cars in your garage" );
        if (car.contains( "Maserati" ))
            System.out.println ( "italian cars in your garage" );
        if (car.contains( "Jaguar" ))
            System.out.println ( "british cars in your garage" );}

          else  System.out.println ( "no" + car + " in your garage" );


    }}