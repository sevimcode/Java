//write a method accepts an int array and a number.
//        Replace any negative numbers in your array with the given number. Print the array
//solved with varargs

package methods;

import java.util.Arrays;

public class VarArrgsReplaceNegativeNumbers{


        public static void main(String[] args){

            printNegative(10,-2,3,-3,4,4,3);  // for varargs you can passed numbers in here

        }


        public static void printNegative(int num, int ... arr) { //int ... arr is called var args

            for (int array : arr) {        // when you use varargs you need to put them at the end of the parameter

                if (array < 0) {
                    array = num;

                }
                System.out.println(array);
            }

        }

    public static void changeNegativeNumbers(int [] arr, int change) {

        for(int i=0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = change;
            }
        }

        System.out.println(Arrays.toString(arr));

    }



    }






