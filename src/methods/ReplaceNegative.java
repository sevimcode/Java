//replace negative numbers in array with given number

package methods;

import java.util.Arrays;

public class ReplaceNegative{


    public static void main(String[] args){
        int  [] arr= {1,-2,3,-3,4,4}; // you need to declare array here
        printNegative(arr,3);
        System.out.println(Arrays.toString(arr)); // it will give you unchanged one
    }


    public static void printNegative(int [] arr, int num){ //

        for (int array : arr) {

            if (array < 0) {
                array =num;

            }
            System.out.println(array);

        }
    }

    }
