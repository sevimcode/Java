package oca;

public class Equality2{

    public static void main( String[] args ) {
        String str1 = "Java";
        String str2 = new String("Java");
        //line n1

        if (str1.equalsIgnoreCase(str2)) { // answer is this line
            System.out.println("equal");   // prints equal
        } else {
            System.out.println("not equals");
        }
        if (str1 ==str2)
            System.out.println("same memory location");
        else
            System.out.println("different memory location"); // prints different memory location


    }
}