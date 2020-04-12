package methods;

public class NegativeNumberGivenArray{



    public static void main(String[] args){
     int  [] arr= {1,-2,3,-3,4,4}; // you can use same arr name here this is different than the other arr
     printNegative(arr);

    }

   public static void printNegative(int [] arr){ // this arr is local yo here


        for (int array : arr){

            if (array <0){
                System.out.println(array);
            }
        }


    }
}
