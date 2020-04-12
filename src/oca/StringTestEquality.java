package oca;

public class StringTestEquality{

    public static void main(String[] args)
        {
            String s1 = new String("HELLO");
            String s2 = new String("HELLO");
            System.out.println(s1 == s2);     // compares their hashCode   (false) objects are not in the same place
            System.out.println(s1.equals(s2)); //compares values in the object  (true)
//false true
            String str = "hello";
            String str1 = "hello";
            System.out.println(str == str1); // compares hashCode but java takes same values in the String pool (true)
            System.out.println(str.equals(str1)); //compares values (true)
// true true
        }
    }

