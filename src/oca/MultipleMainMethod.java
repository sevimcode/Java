package oca;

public class MultipleMainMethod{

    public static void main( int[] args ) {
        System.out.println ("int main " + args[0]);
    }
    public static void main( Object[] args ) {
        System.out.println ("object main " + args[0]);
    }

    public static void main( String[] args ) {
        System.out.println ("String main " + args[0]);
    }

} // javac filename.java
// java filename 1 2 3
// prints String main 1
