package Arrays2D;

// we use nested loops for printing 2D arrays

public class Looping2Darrays{


    public static void main(String[] args){

        int [][] nums = {{1,2,3,3}, {5,6,7,7}, {8,8,8,9}};

        for (int i=0; i<nums.length ; i++){   // i keep track of array positions
            for (int j=0; j<nums[i].length ; j++){ // j keep track of elements in the arrays num[i] tracks the size of arrays

                System.out.println(nums[i][j]);

            }
            System.out.println();
        }

       // we can do same print with each loop

        for (int [] inner : nums) {  //  prints the arrays
            for (int element : inner) { // prints the elements

                System.out.println(element);

            }
            System.out.println();
        }



    }



}
