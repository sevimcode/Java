package arrays;

import java.util.Arrays;

public class BinSearch{

    public static void main( String[] args ) {


        String [] grocery = { "apple" , "orange" , "carrot" , "strawberry" , "mango" };


        Arrays.sort(grocery);
        System.out.println(Arrays.toString(grocery));
        System.out.println("Apple index number : "+ Arrays.binarySearch(grocery , "apple"));
        System.out.println("Orange index number : " + Arrays.binarySearch(grocery , "orange"));


    }}

