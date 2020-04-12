package oca;

public class Equality8{
    public static void main( String[] args ) {
        String s = "Hello";
         String t = new String(s);
    //  if ("Hello".equal(s)) System.out.println("one"); // you can not compare two string objects
         if (t == s) System.out.println("two");
  //    if (t.equal(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
    }
}
