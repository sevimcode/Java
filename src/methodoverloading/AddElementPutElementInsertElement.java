//Create a method that will take a String array and a String.
//        Increase your array capacity and add the given String as the last element of the new array. Return the new array
//

package methodoverloading;

import java.util.Arrays;

public class AddElementPutElementInsertElement{

    public static String [] addArray(String [] array, String word){  //ADD ELEMENT

        String [] array1 = new String[array.length+1] ;
        for (int i =0; i<array.length ; i++){
            array1 [i] =array[i];}

        array1[array1.length-1]= word;
        return array1;


    }
//    Old tasks: Create a method that will take a String array and a String.
//    Increase your array capacity and add the given String as the last element of the new array.
//    Return the new array
//    New task: Overload the pervious method to take a String array, a String to add to the array,
//    and number position where the new element should be added
//





    public static String [] addArray(String [] array, String word, int number){  // overloaded method

        String [] array1 = new String[array.length+1] ;//[a, b, Sevim, d, e] puts sevim in the number index position
        for (int i =0; i<array.length ; i++){
            array1 [i] =array[i];}

          String [] array3 = new String [5];

        for (int i =0; i<array3.length ; i++){
            if (i==number)
                array3[number]= word;
            else
            array3 [i] =array1[i];}


          return array3;


    }

    public static String [] increaseArray(String [] arr, String word, int index) { //[a, b, sevim, c, d, e]

        String [] newArr = new String[arr.length+1]; //it puts sevim in the position between the array

        for(int i=0, j= 0; j < newArr.length; j++)  {

            if(index == j) {
                newArr[j] = word;
            } else {
                newArr[j] = arr[i];
                i++;
            }

        }

        return  newArr;

    }






    public static void main(String[] args){
        String[] array2 = {"a","b","c","d","e"};
        System.out.println(Arrays.toString(addArray(array2, "Sevim"))); //[a, b, c, d, e, Sevim]
        System.out.println(Arrays.toString(addArray(array2, "Sevim",2)));  // overloaded prints [a, b, Sevim, d, e]
        System.out.println(Arrays.toString(increaseArray(array2, "sevim", 2)));

    }

}