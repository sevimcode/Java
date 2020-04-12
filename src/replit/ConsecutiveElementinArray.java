package replit;



public class ConsecutiveElementinArray{

    public static int getDup(String [] r){
        int count = 0;
        int counter1=0;

        for (int i = 0;i < r.length;i++) {
            counter1=0;
            for (int j = 0;j < r.length;j++)
            {

                if (r[ i ].equals (r[ j ]))

                    counter1++;
            }

            if (counter1==1)
                count++;
        }

        return r.length-count;
    }

    public static void main(String[] args)
    {
        String[] array = {"1","1","2","2","3","4","1"};

        System.out.println(getDup(array));
    }
}