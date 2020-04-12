package Arrays2D;



import java.util.Arrays;

public class Array2D{

    public static void main(String[] args){

        int [] [] groups = new int[3][] ; // prints [null, null, null]  arrays we did not give size to inner array

        int [] [] groups1 = new int[3][4] ; //[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

        System.out.println(Arrays.deepToString(groups));

        System.out.println(Arrays.deepToString(groups1));


        int [] array = {1,2,3,4,4,5,5}; // you can put any size even second one is as 4 initialized
        groups [0] = array;
        System.out.println(Arrays.deepToString(groups)); // prints [[1, 2, 3, 4, 4, 5, 5], null, null]

        String [][] str = new String[4][3];
        System.out.println(Arrays.deepToString(str)); //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]]

        int [][] groups2 = {{1,2,3,3}, {5,6,7,7}, {8,8,8,9}};
        System.out.println(Arrays.toString(groups2[0])); //[1, 2, 3, 3] we print single array
        System.out.println(groups2[0][0]); // prints 1 we do not need tostring or deepstring method for writing
        System.out.println(groups2[2][3]);

        System.out.println(Arrays.toString(groups2[0]) + " "+ Arrays.toString(groups2[2])); // prints first and last array


        System.out.println(groups2.length); // prints 3
        System.out.println(groups2 [2].length); //prints 4





    }











}
