//Make an Enum for all the days in a week. Then write a method that will accept what day it is and print some message.
//        If it is Monday print “Mondays are bad”
//        If it is Friday print “Fridays are great”
//        If it is Saturday or Sunday print “Weekends are the best”
//        If it is any other day print “Regular day”

package enums;

public class DaysUtility{

    public static void main( String[] args ) {

        message(Days.FRIDAY);  // enum class name.one of the enums filed
    }

    public static void message(Days d)  {


        switch (d){

            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case TUESDAY:

            case WEDNESDAY:

            case THURSDAY:
                System.out.println("Regular day");
                break;
            case FRIDAY:
                System.out.println("Fridays are great");
                break;

            case SATURDAY:

            case SUNDAY:
                System.out.println("Weekends are best");
                break;




        }



    }
}
