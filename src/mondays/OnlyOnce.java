package mondays;

public class OnlyOnce{

    public static void main(String[] args){

        int[] array = { 5 , 7 , 8 , 8 , 11 , 55 , 23 , 23 , 23 , 54 , 7 , 1 , 2 , 2 };

        for (int i = 0 ; i< array.length ; i++ )
        {
            int count = 0;


            for (int j = 0; j < array.length; j++)
            {

                if (array[i] == array[j])
                {
                    count++;

                }

            }

            if (count==1)
                System.out.print (array[i]+" ");

        }

    }

}













