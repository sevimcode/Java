// print biggest number and smallest number

package arrays;

import java.util.Arrays;

public class sortNumbersArray {


    public static void main ( String[] args ) {

        int [] nums = {31,20,25,20,3,48,26,12};


        Arrays.sort(nums);
        System.out.println (Arrays.toString(nums) );

        System.out.println ("Smallest" + nums[0] ); // the smallest number
        System.out.println ("Biggest"  + nums[nums.length-1] ); // give you last index of array last index is the biggest

       }

    }












