// Given a String of numbers. Return the difference between the biggest and smallest number

package methods;



import java.util.Arrays;

public class BiggestandSmallest{

    public static int difference(String numbers){
        int biggest=0;
        int smallest=0;

     String [] number = numbers.split("");
        Arrays.sort(number);
        biggest = Integer.valueOf(number[number.length-1]);
        smallest = Integer.valueOf(number[0]);

     int dif = biggest-smallest;

            return dif;


    }


    public static void main(String[] args){


        System.out.println(difference("1867549"));
    }



}
