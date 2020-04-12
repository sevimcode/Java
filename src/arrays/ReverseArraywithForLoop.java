package arrays;



import java.util.Arrays;

public class ReverseArraywithForLoop{


    public static void main(String[] args){


        int[] nums = {1,2,3,4,5};


        int[] reversed = new int[ 5 ];

        int i=0;
        int j=0;

        for (i = nums.length-1 ; i>=0 ; i--){

            reversed[j] = nums[i];
            j++;
        }

        System.out.println(Arrays.toString(reversed));
    }
}