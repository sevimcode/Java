package Arrays2D;

import java.util.Arrays;

public class printingArray2D{
    public static void main(String[] args){


        int[][] nums = { { 1 , 2 , 3 , 3 } , { 5 , 6 , 7 , 7 } , { 8 , 8 , 8 , 9 } };

        for (int[] inner : nums) {

            System.out.println(Arrays.toString(inner));

        }
    }
}








