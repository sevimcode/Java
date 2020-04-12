
//Sample values: {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}}
//
//        ——————
//        Create a method that will return the biggest numbers from a 2D array

package Arrays2D;



public class BiggestNumber{


   public static int biggest(int [][] nums){
       int checked = nums [0][0];  
       for (int i=0; i<nums.length ; i++){
           for (int j=0; j<nums[i].length ; j++){

              if (nums[i][j]>checked){
                  checked=nums[i][j];
              }

           }

       }
       return checked;


   }


    public static void main(String[] args){

    int [] [] array= {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};

        System.out.println(biggest(array));

   }






}
