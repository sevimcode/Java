package oca;



public class HelloLog{

    public static void main( String[] args ) {
        int x= 1;
        int y=0;
        if (x++ > ++y) {
            System.out.println ("Hello");
        }else{
            System.out.println ("welcome");}
        System.out.println ("Log " + x + ":" + y);

    }
}
