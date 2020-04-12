//Create a method that will generate a random 2D int array. Take two parameters.
//        The first one for how many 1D arrays you want, and
//        second how many elements each 1D array should have
//


package Arrays2D;

import java.util.Arrays;
import java.util.Random;

public class RandomArray{

    public static void main(String[] args){

        System.out.println(Arrays.deepToString(random2D(3, 5)));
    }
public static int [][] random2D (int num1, int element){

         Random random = new Random ();
    int [][] arr = new int[num1][element];

      for (int i =0; i<num1 ; i++) {
          for (int j =0; j<element ; j++) {

              arr [i][j]= random.nextInt(101);

          }
      }




  return arr ;
}





}
