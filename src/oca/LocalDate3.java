package oca;

import java.time.LocalDate;

public class LocalDate3{

    public static void main( String[] args ) {
        LocalDate date = LocalDate.of ( 2012,01,3);
        date.plusDays ( 10 );
        System.out.println (date);
    }
} // 2012-01-03
