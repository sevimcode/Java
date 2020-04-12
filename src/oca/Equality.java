package oca;

public class Equality{


    public static void main( String[] args ) {

        String str1 = "Java";
        String [] str2 = {"J","a","v","a"};
        String str3="";

        for (String str : str2 ){

            str3 = str3 + str;
        }
            boolean b1 = (str1==str3);  //==  checks if both objects point to the same memory location
            boolean b2 = (str1.equals(str3)); // compares the values
        System.out.println(b1);  // prints false
        System.out.println(b2);  // prints true




    }




}
