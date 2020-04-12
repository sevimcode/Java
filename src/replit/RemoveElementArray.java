package replit;

import java.util.Arrays;

public class RemoveElementArray{

        public static int[] deleteR(int[] arr,int element) {
            int [] array2 = new int [arr.length-1];

          // int index=0;
           int i =0;

            for (i= 0; i<array2.length ; i++){

                if (arr[i] == element){
                   // index = i;
                    break;}

            }
            System.out.println(i);

            for (int j= 0; j<i ; j++)
                array2[j]=arr[j];

            for (int k=i; k<array2.length ; k++)
                array2[k]=arr[k+1];


            return array2;
        }

        //end deleteR
        public static void main(String[] args){
            int [] array1 = {1,2,3,5,6,7,8};
            System.out.println(Arrays.toString(deleteR(array1, 3)));

        }

    }



