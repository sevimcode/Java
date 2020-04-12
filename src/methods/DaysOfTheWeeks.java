
//Write a method that will tell you if it is the weekday or not.
//        The method takes a String, Saturday and Sunday are the only weekend days


package methods;

public class DaysOfTheWeeks{

    public static boolean days(String day){

        switch (day) {

            case "monday":

            case "tuesday":

            case "wednesday":

            case "thursday":
                case "friday":
                return true;
            case "saturday":
            case "sunday":
            default:
                System.out.println("invalid day format");
                return false;

        }
    }


    public static void main(String[] args){


        if (days("monday"))
        System.out.println("it is weekday");
        else
           System.out.println("it is not weekday ");

    }




}














