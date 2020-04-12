package forloops;


//skip the number 3 13 23 33 43
public class SkipTheNumberContinue {

    public static void main ( String[] args ) {


        for (int i=0 ; i<50; i++){
//           if (i==3)
//               continue;

            if (i %10 == 3)
                continue;
            System.out.println (i);

        }





    }






}
