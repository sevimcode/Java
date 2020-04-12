package replit;

import java.util.Arrays;

public class findingNumbers{


    public static int[] extractNum(String str){
        String word = "";
        for (int i = 0;i < str.length();i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                word += str.charAt(i) + "";

        }
        System.out.println(word);

        String[] array = word.split("");
        int[] nums = new int[ array.length];


        for (int i = 0;i < array.length ;i++) {

          nums[i] = Integer.valueOf(array[i]);

        }
        return nums;

    }


    public static void main(String[] args){

        String str = "$%^7855";
        System.out.println(Arrays.toString(extractNum(str)));

    }
}