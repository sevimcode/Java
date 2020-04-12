package Arrays2D;

import java.util.Arrays;

public class LengthofArraysInitializeArray{

    public static void main(String[] args){


        int[][] array = { { 1 , 2 , 3 , 4 , 4 } , { 3 , 4 , 5 , 6 } , { 3 , 4 , 5 , 6 } };

        System.out.println(" length of row 1 : " +array[0].length + "of elements");
        System.out.println(" length of row 2 : " +array[1].length + "of elements");
        System.out.println(" length of row 3 : " +array[2].length + "of elements");


        String [] [] names = new String[3][];
        String [] name1 = {"sevim", "murat" , "gul", "sedat"};
        String [] name2 = {"sevim", "murat"};
        String [] name3 = {"sevim", "murat" , "ikbal"};

        names [0] = name1;
        names [1] = name2;
        names [2] = name3;

        System.out.println(Arrays.deepToString(names));


    }
}