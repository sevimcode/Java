
//        int [] array = {1,2,3,4,5};
//        for (int i: array) {
//        if ( i < 2)
//        {
//        keyword1 ;
//
//        }
//        System.out.println(i);
//        if ( i == 3) {
//        keyword2 ;
//        }
//        }
//        What should keyword1 and keyword2 be respectively, in oreder to produce output 2345?
//        A. continue, break
//        B. break, break
//        C. break, continue
//        D. continue, continue


package oca;

public class ContinueBreak{
    public static void main( String[] args ) {


        int[] array = { 1 , 2 , 3 , 4 , 5 };
        for (int i : array) {
            if (i < 2) {
                continue;

            }
            System.out.println(i);
            if (i == 3) {
                continue;     // answer is continue
            }
        }

    }

}
