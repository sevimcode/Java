package oca;

public class StringEx2{

    public static void main( String[] args ) {
        String str = null;
        str = str+"good";
        System.out.println (str); // nullgood

        String str1 = null;
        str1 = str1.concat ("good"); // when you call a method on null you will get nullpointerexception

    }
}
