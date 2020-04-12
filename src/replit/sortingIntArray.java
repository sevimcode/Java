package replit;


import java.util.Arrays;

public class sortingIntArray{

    public static void main( String[] args ) {
        // public int[] sort( int[] array ) {

        int[] array = { 67 , 66 , 43 , 56 , 32 , 79 };

        int temp = array[0];


        int k = 0;
        for (int i = 0 ;i < array.length ;i++) {
            for (int j = 0;j < array.length - 1;j++) {

                if (array[ j ] > array[ j + 1 ]) {
                    temp = array[ j ];
                    array[ j ] = array[ j + 1 ];
                    array[ j + 1 ] = temp;

                }
            }
        }
        // return array1;

        System.out.println(Arrays.toString(array));

    }
}



