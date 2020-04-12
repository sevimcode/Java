package oca;

public class App{

    int count;   // you can not use non static variable in static method

    public static void displayMsg(){

//        count++;                                              //line n1
//        System.out.println("welcome visit count " + count);  // line n2
    }

    public static void main( String[] args ) {
        App.displayMsg();
        App.displayMsg();
    }

//    A. Compilation fails at line n3 and line n4.
//    B. Compilation fails at line n1 and line n2.   answer is B
//    C. Welcome Visit Count:1 Welcome Visit Count: 2
//    D. Welcome Visit Count:1

}
