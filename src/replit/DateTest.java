package replit;

import static replit.Date.*;

public class DateTest{


    public static void main( String[] args ) {


        System.out.println(isLeapYear(2004));
        System.out.println(isValid(22,2,2222));
        System.out.println((new Date(12,1,2017)).dateToWords());
    }


}
