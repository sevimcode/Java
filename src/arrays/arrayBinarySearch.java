package arrays;

import java.util.Arrays;

public class arrayBinarySearch {

    public static void main ( String[] args ) {
    int[] nums = { 2,5,7,14 };

        Arrays.sort (nums);
        System.out.println (Arrays.toString (nums));
        System.out.println ("index of 2 "  + Arrays.binarySearch(nums, 2)); // prints 0
        System.out.println ("index of 7 "  + Arrays.binarySearch(nums, 7)); // prints 2
        System.out.println ("index of 9 "  + Arrays.binarySearch(nums, 9)); // prints -4 position would be 3 then +4
        System.out.println ("index of 15 "  + Arrays.binarySearch(nums, 15));// prints -5  it gives the position would be is 4 then +1
// 15 is outside of the index



    }
}