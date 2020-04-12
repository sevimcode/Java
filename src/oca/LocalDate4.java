package oca;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate4{
    public static void main( String[] args ) {


        LocalDateTime d = LocalDateTime.of (2015 , 5 , 10 , 11 , 22 , 33);
        DateTimeFormatter f = DateTimeFormatter.ofPattern ("hh:MM");
        System.out.println (d.format (f));


    }
} // 11:05