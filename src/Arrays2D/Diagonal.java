
//Create a method that will take 2d array and return the difference between the sum of the diagonals

package Arrays2D;

public class Diagonal{


    public static void main(String[] args){
        int [][] nums = {{2,2,2,2}, {2,2,2,2}, {2,2,2,2}, {2,2,2,3}};

        System.out.println(diagonal(nums));
    }


public static int diagonal(int[][] arr1){
        int sum1 =0;
        int sum2=0;
        int dif=0;

    for (int i =0; i<arr1.length ; i++) {

          sum1 = sum1+ arr1 [i][i];


    }

    for (int j =arr1.length-1 , k=0 ; j>=0 ; j--) {


            sum2 = sum2+ arr1 [k++][j];

        }


       dif=sum1-sum2;

    return Math.abs(dif);
}



}



