package replit;


// ArrayUtils.reverse(assetClasses); reversing an array with ArrayUtil class The ArrayUtils class is from Apache commons lang
//apache dependency

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArraywithTemp {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            for(int i=0; i<nums.length/2; i++){
                int temp = nums[i];
                nums[i] = nums[nums.length -i -1];
                nums[nums.length -i -1] = temp;
            }


            System.out.println(Arrays.toString(nums));

        }
    }



