package oca;

public class Equality1{

    public static void main( String[] args ) {
        String s1 = "Hello world";
        String s2 = " Hello world";    // strings are immutable

        s2 = s2.trim();

        System.out.println(s1==s2);  // prints false
        System.out.println(s1.equals(s2));  // print true  compares the value of the string

        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s3==s4); // prints true


    }

}
