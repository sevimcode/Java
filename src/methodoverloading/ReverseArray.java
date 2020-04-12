//We have a method that reverses a String, overload it to accept an int array and reverse the elements in the array.
//        Return the reversed array.
//        Also over load the method to accept a String array and reverse the elements in that array.
//        Return the reserved array.
//


package methodoverloading;


import java.util.Arrays;

public class ReverseArray{

    public static String reverse(String word){

        String rev = "";
        for (int i = word.length()-1;i >= 0;i--) {

            rev += word.charAt(i);


        }
        return rev;

    }

   // we overload the method with a String array then we reverse the array


    public static String [] reverse(String [] word){ // overloaded new method!!!

        String [] reverseArray = new String[word.length];

        for(int i=0; i<word.length/2; i++){
            String temp = word[i];
            word[i] = word[word.length -i -1];
            word[word.length -i -1] = temp;
        }
        return word;
    }



    public static void main(String[] args){

        System.out.println(reverse("sevim"));
        String [] array = {"sevim", "murat" , "sedat" , "gulnihal", "ikbal"};
        System.out.println(Arrays.toString(reverse(array)));

    }






}
