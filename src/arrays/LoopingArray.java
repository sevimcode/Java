//3) Create String array for the colors.
//        Initialize 4 colors.
//        Loop through each element using for loop and print each color names.
//     if the color characters 4 and more print

package arrays;

public class LoopingArray {

    public static void main ( String[] args ) {

        String [] colors ={ "red" , "yellow" , "black", "white"};

        for (int i = 0; i<colors.length ; i++){ // length for array

            if (colors[i].length() > 4) // length for the string value

            System.out.println (colors[i]);


        }




    }

}
