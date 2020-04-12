package oca;

public class orderEx{

    static void m(int i){   // be careful static block runs only one time
        i+=7;

    }

    public static void main( String[] args ) {
        int j=12;
        m(j);
        System.out.println(j);    // prints 12
    }
}
