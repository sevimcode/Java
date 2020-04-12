package oca;



public class LoopEx{

    static double dValue;
    static Object ref;



    public static void main( String[] args ) {


        System.out.println (ref);    //null
        System.out.println (dValue); //0.0

        int [] xx = null;
        for (int ii : xx)
            System.out.println (ii); // null pointer exception



    }
}
