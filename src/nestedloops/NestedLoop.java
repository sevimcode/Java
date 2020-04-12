package nestedloops;

public class NestedLoop {


    public static void main ( String[] args ) {
// if you declare your i an j here they can be used for whole program not local variable
        for (int i= 0; i<5; i++)
        {
            System.out.println (" i is "+i);
            System.out.println ();  // give line after each i number

            for (int j=0; j<=i ; j++) // this time inner loop depend on outer loop .. prints more every time when i increments
            {

                System.out.println (" j is "+ j); // if you declared j inside this loop its local to here yo can not use it out side of the loop

            }
            System.out.println ();
        }


    }
}






