// print out the index of -3 if it exist in the array.

package arrays;

import java.util.Arrays;

public class binarySearch {


    public static void main ( String[] args ) {

        int[] nums = { 45,23,6,-3,66};

        Arrays.sort (nums);
        System.out.println (Arrays.toString (nums));
        System.out.println ("Index of -3 "  + Arrays.binarySearch(nums, -3));





    }




}
