package oca;



public class Test2{

    public static void main( String[] args ) {
        Test2 ts = new Test2();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
// false true