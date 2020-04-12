package mondays;

public class RepetitiveNumbersinArray{


    public static void main(String[] args){

        int[] array = { 5 , 7 , 8 , 8 , 11 , 55 , 23 , 23 , 23 , 54 , 7 , 1 , 2 , 2 };

        String uniques = "";
        int i = 0;
        int j = 0;
        int count=0;
        int checked=5;


        for (i = 0;i < array.length ;i++)
        {
            if (checked!=array[i])
            {
                for ( j = 0;j < array.length ;j++)
              {
                    if (j == i)
                    break;
                    if (array[ i ] == array[ j ])
                    {
                    checked = array[i];
                    uniques += array[j]+" ";
                    }
              }
            }


        }

        System.out.println(uniques);

    }
}


