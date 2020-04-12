//0.7) Given you have two arrays with values of:
//        3,2,6,43,7,20      and
//        2,7,-10,10,-5,2
//        Write a program that adds each element and stores them into a new array. Print the final array


        package arrays;

import java.util.Arrays;

public class CombiningArrays {
    public static void main ( String[] args ) {


        int [] array1 = {3,2,6,43,7,20  };
        int [] array2 = {2,7,-10,10,-5,2 };
        int [] array3= new int[6];

        for (int i = 0;i < 6;i++) {

            array3[i]=array1[i]+array2[i];


        }

        System.out.println (Arrays.toString(array3) );
    }



}
