// finding biggest number

package arrays;


public class FindingMaxArray {


    public static void main ( String[] args ) {


        int[] num = {3, 7, 14, 70, 50, 20};
        int max = num[0];

        for (int i = 1; i < num.length; i++) { // for negative and positive number you need to make i=0

            if (num[i] > max)
                max = num[i];


        }

            System.out.println ( max );
        }




    }








