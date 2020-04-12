package Animal;

import java.util.ArrayList;

public class Test{
    public static void main( String[] args ) {
        ArrayList<Animal> myList  = new ArrayList<> ();
        myList.add ( new Tiger () );
        ArrayList<Hunter> myList1  = new ArrayList<> ();
        myList1.add ( new Cat () );
        ArrayList<Hunter> myList2  = new ArrayList<> ();
        myList2.add ( new Tiger () );
//        ArrayList<Tiger> myList3 = new ArrayList<> (); // fail to compile
//        myList3.add ( new Cat () );
        ArrayList<Animal> myList4 = new ArrayList<> ();
        myList4.add ( new Cat () );




    }
}
