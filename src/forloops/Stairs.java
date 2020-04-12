package forloops;

public class Stairs {

    public static void main ( String[] args ) {

        for (int b=1; b<7 ; b++)
        {
            for (int a=1; a<b; a++)
            {
                System.out.print(a);
            }
            System.out.println(b);

        }

             int k=1;
            for (int i =0; i<6 ; i++){
                for (int j =1; j<i+1 ; j++){

                    System.out.print(k++);


                }
                System.out.println();
            }
        }

    }









