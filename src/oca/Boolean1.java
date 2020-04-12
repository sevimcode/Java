package oca;

public class Boolean1{
    public static void main( String[] args ) {


        Boolean1 ts = new Boolean1 ();
        System.out.println (isAvailable + " ");
        isAvailable = ts. doStuff();
        System.out.println (isAvailable + " ");
    }
    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable =false;
}
// prints false : true