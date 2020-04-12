package oca;

public class Equality4{

    public static void main( String[] args ) {


        String s1 = "java";  // string literal from string pool
        String s2 = "java";  // string literal from string pool pointing unique java

        StringBuilder sb1 = new StringBuilder();
        sb1.append("ja").append("va");

        System.out.println(s1==s2);  // TRUE POINTING SAME OBJECT  == looking for memory address
        System.out.println(s1.equals(s2)); // TRUE
        System.out.println(sb1.toString() == s1); // FALSE toString is not from string pool
        System.out.println(sb1.toString().equals(s1)); // TRUE values are same
    }
}// you need to use toString method for StringBuilder object