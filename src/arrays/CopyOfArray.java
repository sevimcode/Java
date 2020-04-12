package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArray{


    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to DIVIDE MY ARRAY");
        System.out.println("Enter a number that will be the size of your array: ");
        int i = input.nextInt();
        int [] arr = new int[i];
        System.out.println("Enter numbers for your array :");

        for (int j =0; j<arr.length ; j++){
            arr[j] = input.nextInt();
        }

        System.out.println("String value of array is: " + Arrays.toString(arr));
        System.out.println("The first half of the array: " + Arrays.toString(Arrays.copyOfRange(arr , 0 , arr.length / 2)));
        System.out.println("The second half of the array : " + Arrays.toString(Arrays.copyOfRange(arr , arr.length / 2, arr.length)));
    }
}
