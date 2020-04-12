package replit;

import java.util.Scanner;

public class FindUniqueelementinArray {


    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);
        int[] nums = { input.nextInt() , input.nextInt() , input.nextInt() , input.nextInt() , input.nextInt() , input.nextInt() , input.nextInt() };


        String word ="";
        int n = nums.length;
        int i, j;


        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++)
                if (nums[i] == nums[j])
                    break;
                 if (i == j)
                 word += nums[i] + " ";

        }

        System.out.println(word);

    }
}
