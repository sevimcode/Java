package oca;

public class Equality9{

    public static void main( String[] args ) {

        StringBuilder s1 = new StringBuilder("meow");
        StringBuilder s2 = new StringBuilder("meow");
        if (s1 == s2) System.out.println("one"); // don't compare like this two stringbuilder object
        if (s1.equals(s2)) System.out.println("two"); // you cannot call equal on stringbuilder object
    //  if (s1 == "meow") System.out.println("three");  //cannot compare like this compilation error
        if (s1.toString() == "meow") System.out.println("four");

    }
}
