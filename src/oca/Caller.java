package oca;

public class Caller{

    private void init (){
        System.out.println ("initialized");
    }
    public void start () {
        init () ;
        System.out.println ("started");
    }

    public static void main( String[] args ) {
        Caller caller = new Caller ();
        caller.start ();
        caller.init ();
    }

}
