package varargs;

import java.util.Arrays;

public class varargsexample{

    public static void main(String[] args){

   maxNumber(3,2,4,5,40);

    }

    public static void maxNumber(int ... arr){
        Arrays.sort(arr);
        System.out.println("biggest number is " + arr[arr.length-1]);
    }




}
