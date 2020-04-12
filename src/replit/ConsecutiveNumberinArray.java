package replit;

import java.util.Scanner;

public class ConsecutiveNumberinArray {

    public static void main ( String[] args ) {

        boolean have5 = false;
        boolean consecutive = false;
        boolean no5 =false;

        Scanner input = new Scanner(System.in);
        int[] nums = { input.nextInt() , input.nextInt() , input.nextInt() , input.nextInt() , input.nextInt() };


        for (int i = 0;i < 5;i++) {
            if (nums[ i ] == 5)
                have5 = true;}


        if (nums[0]==5){
            if(nums[0]==nums[1])
                consecutive=true;}

        if (nums[1]==5){
            if(nums[1]==nums[2])
                consecutive=true;}

        if (nums[2]==5){
            if(nums[2]==nums[3])
                consecutive=true;}

        if (nums[3]==5){
            if(nums[3]==nums[4])
                consecutive=true;}

        if (nums[4]==5){
            if(nums[4]==nums[5])
                consecutive=true;}

        for (int a=0 ; a<nums.length ; a++){
             if (nums[a]==5)
                 no5=true;}


        if (consecutive)

            System.out.println("true");
        else
            System.out.println("false");


    }
}