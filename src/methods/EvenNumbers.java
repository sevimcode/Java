//Create a method that will count how many even numbers there is from the given array and return the value

package methods;

public class EvenNumbers{

    public static int positiveCount( int [] nums){

 int count=0;
   for (int i=0; i<nums.length ; i++){

       if (nums[i]>0){

           count++;

       }
   }
        return count;
    }

    public static void main(String[] args){

       int [] array ={1,3,4,5,5,6};
        System.out.println(positiveCount(array));

    }



}
