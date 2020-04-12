package Arrays2D;

import java.net.BindException;

public class BiggestSum{


    public static int biggestSum(int [][] nums){
        int index =0;
        int sumchecked=0;
        int sum = 0;

        for (int i=0; i<nums.length ; i++) {

            for (int j = 0;j < nums[ i ].length;j++) {


                sum += nums[ i ][ j ];


            }

            if (sum > sumchecked) {
                sumchecked = sum;
                index = i;

            }
            sum=0;
        }


        return index;


    }


    public static void main(String[] args){

        int [] [] array= {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};

        System.out.println(biggestSum(array));

    }






}





