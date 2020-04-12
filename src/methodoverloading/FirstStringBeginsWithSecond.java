//Create a method that will accept two Strings. Return true if the first string begins
//        with the second String. Return false if it does not.
//        Overload the method to accept a two Strings and a number.
//        Return true if the second String is found inside of your first String the amount of
//        times equal to your number parameter.
//        input: “jamesjajl”,”ja", 2
//        output: true


package methodoverloading;


import java.util.Arrays;

public class FirstStringBeginsWithSecond{


    public static boolean beginsWith(String first , String second){

        boolean check = false;

        if (first.startsWith(second))
            check = true;

        return check;
    }

    public static boolean beginsWith(String first , String second , int num){

        boolean check = false;

        String[] word = first.split(second);
        int length = word.length;

        if (length == num)
            check = true;

        return check;
    }


    public static void main(String[] args){

        System.out.println(beginsWith("sevimmurat" , "murat"));
        System.out.println(beginsWith("sevimmuratsevimmuratsevim" , "sevim" , 2));

        // prints [, murat, murat] array length is 3


    }
}