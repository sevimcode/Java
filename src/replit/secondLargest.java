package replit;

import java.util.Arrays;

public class secondLargest{


    public static int secondLargestNum(int[] arr) {
        Arrays.sort(arr);
        int secondBiggest = arr[0];
        for(int i = arr.length - 1; i > 0; i--) {
            if(arr[i] > arr[i-1]){
                secondBiggest = arr[i - 1];
                break;
            }
        }
        return secondBiggest;
    }


    public static void main(String[] args){
        int array [] ={10, 6, 1, 8, 9, 9, 11, 10, 9};
        System.out.println(secondLargestNum(array));
    }

}