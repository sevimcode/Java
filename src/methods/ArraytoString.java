//Write a method that accepts an int array.
//        Print out the array using the same format as Arrays.toString method.
//        DO NOT USE THE toString() METHOD.
//        [element, element, element]   toString method how does it work
//



package methods;

import java.util.Arrays;

public class ArraytoString{

    public static void main(String[] args){
     int [] array = {1,2,3,4,5,6};
     arraysToString(array);

    }


        public static void arraysToString(int [] arr) {
            //output: [10,9,5,4,3,7,4]
            String result = "[";

            for(int num : arr) {
                result += num + ", ";
            }

            result = result.substring(0,result.length()-2) + "]";
            System.out.println(result);

        }


    }




