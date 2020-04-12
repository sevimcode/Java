package arrays;

import java.util.Arrays;

public class MaxMin{

    public static void main( String[] args ) {

        int [] nums = { 10,15,25,1,33,45,56,67,87,500};
        Arrays.sort(nums); // sorted minimum to maximum
        System.out.println("Min Grade :" + nums[0]);
        System.out.println("Max Grade :" + nums[nums.length-1]);

//without sort method

        int max = nums[0];
        int min = nums[0];

    for (int i=0; i<nums.length; i++){

        if (max<nums[i])  max = nums[i];
        if (max>nums[i])  min = nums [i];

    }
        System.out.println("maximum " + max);
        System.out.println("minimum " + min);
    }



}
