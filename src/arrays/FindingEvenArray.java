
// find even number in your array and put them in new array then print  the new array

package arrays;

import java.util.Arrays;

public class FindingEvenArray {


    public static void main ( String[] args ) {


        int[] num = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int[] num2 = new int[10];
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num2[i] = num[i];

            }

        }

        System.out.println ( Arrays.toString (num2));



    }}
//      if (num[i] % 2 == 0) {
//              count++;  //    you can make new array for even numbers. too
//
//              }
