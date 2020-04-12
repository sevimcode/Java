package oca;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDate2{

    public static void main( String[] args ) {
       String date = LocalDate.parse ( "2014-05-04" ).format ( DateTimeFormatter.ISO_DATE_TIME );

        System.out.println ( date );

        String date1 = "2019-03-23";
        LocalDate localDate = LocalDate.parse(date1);
        System.out.println (localDate);

    }
}
//Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
// String date2 = LocalDate.parse ( "2014-05-04" ).format ( DateTimeFormatter.ISO_DATE ); //should be like this
//ISO_DATE_TIME can not work on LocalDate object