package oca;

public class Exception4{
    public static void main( String[] args ) {
        try{
            method1 ();
        }catch(MyException1 ne){
            System.out.println ("A");
        }
    }

    public static void method1() {
        try {
            throw Math.random () > 0.5 ? new MyException1 () : new RuntimeException ();
        } catch (RuntimeException re) {
            System.out.println ("B");
        }


    }// prints B
}
