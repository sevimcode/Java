package p2;

import p1.Acc;

public class Test extends Acc{



    public static void main( String[] args ) {
        Acc obj = new Test ();
        obj.s=10;
    } // only s available for Test class

}
