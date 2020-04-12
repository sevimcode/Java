
//Write a method that will take three arguments: the hour, the minutes, and a boolean
//        ( AM will be true, PM will be false) Use the given information to print out the time in this format:
//        Hours : minutes amOrPM
//        — Hours should be in the range 1-12, minutes should be in the range from 1 to 59.
//        If either of those information provided is not valid, do not continue your program,
//        just print “Invalid time information given
//        input: 4, 39, true
//        Output: 4 : 39 AM
//

        package methods;



public class AmPm{

    public static void main(String[] args){
       ampm(4, 45, true);

    }

    public static void ampm(int hours, int mins, boolean ampm){
        String word ="";
        if (( hours>0 &&  hours<13 )&&( mins>=0 &&  mins<60 )){

                if (ampm) {
                    word ="AM";

                }else{
                    word ="PM";

                }

                System.out.println(hours + " : " + mins + " " + word);

        }else{
            System.out.println("invalid format");
        }

    }



    }





