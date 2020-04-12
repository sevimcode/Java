package arrays;

import java.util.Scanner;

public class findMaxandMinNumber {


    public static void main ( String[] args ) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};



        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < min)
                min = nums[i];}
        System.out.println(min);



            int max = nums[ 0 ];
            for (int i = 1;i < nums.length;i++){
                if (nums[ i ] > max)
                    max = nums [i];}
        System.out.println(max);

    }
}