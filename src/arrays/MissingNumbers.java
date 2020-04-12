package arrays;



public class MissingNumbers{


    public static void main( String[] args ) {
        int[] arr = { 0 , 1 , 2 , 3,4,10  };
        int counter = 0;


        for (int i = 0;i < arr[arr.length -1] ;i++) {
            counter = 0;

            for (int j = 0;j < arr.length;j++) {

                if (i == arr[ j ]) {
                    counter++;
                }
            }


            if (counter == 0){
                System.out.println("missing item " + i);

        }
    }
    }
}






