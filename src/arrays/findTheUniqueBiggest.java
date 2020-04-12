// find two unique biggest number from the Array

package arrays;

import java.util.Arrays;

public class findTheUniqueBiggest {


    public static void main ( String[] args ) {


        int [] nums = { 9,89,45,67,89,90,9};


        Arrays.sort(nums);
        System.out.println (Arrays.toString(nums) );
        String checked =""; // we checked the number I don't want to check again with this ignoring it
        int count=0;




        for (int i= nums.length-1 ; i>=0 ; i--){
            if (count==2){  //we want to print 2 numbers
                break;
            }

            if(!checked.contains(nums[i]+ " ")){ // controls same number whether comes or not if it is not same then print
                System.out.println(nums[i]); // don't print the checked one
                checked += nums[i] +" ";
                count++;}      // controls how many print we will have

        }





    }




}
