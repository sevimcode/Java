// labeling loops

package nestedloops;

public class LabelingLoops {

    public static void main ( String[] args ) {
    outer:   for (int i= 0; i<10; i++)  // you can label your loops "outer"

        {
            System.out.println (" i is "+i);
            System.out.println ();  // give line after each i number

         inner:   for (int j=0; j<10 ; j++){
                if (j==3){
                continue inner;
            }

                System.out.println (" j is "+ j);
                if (i==2){
                    break outer;   // when i =2 it just break the outer loop
                }

            }
            System.out.println ();
        }


    }
}
