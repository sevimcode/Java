package eachloop;

public class Example {

    public static void main ( String[] args ) {

        int [] numbers = {1,2,3,4,5,6};

        //traditional loop

        for (int i= 0; i<numbers.length ;i++){
            System.out.println (numbers[i] );
        }


        //same with

        //for each loop

        for (int number : numbers){
            System.out.println (number );  //we name it  "number" then loop through array
        }


    }






}
