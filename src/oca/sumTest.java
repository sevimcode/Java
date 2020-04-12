package oca;

public class sumTest{

    public static void doSum (Integer x , Integer y){
        System.out.println("integer sum is " + (x+y));

    }
    public static void doSum (double x , double y){
        System.out.println("double sum is " + (x+y));

    }
    public static void doSum (float x , float y){
        System.out.println("float sum is " + (x+y));

    }
//    public static void doSum (int x , int y){
//        System.out.println("int sum is " + (x+y));
//
//    }

    public static void main( String[] args ) {
    doSum(10,20);  // int primitive always prefered on Integer object    // prints int sum is 30
    doSum(10.0, 20.0);// double primitive always prefered on float   //double sum is 30.0
    }

}
