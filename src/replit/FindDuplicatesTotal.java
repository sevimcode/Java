package replit;


public class FindDuplicatesTotal{

    public static int getDup(String[] r){

        int count = 0;
        int counter1=0;
        int n = r.length;
        String word = "";

        for (int i = 0;i < n;i++) {
            counter1=0;

            for (int j = 0;j < n;j++)
            {

                if (r[ i ].equals (r[ j ]))

                    counter1++;
            }

            if (counter1==1)
                count++;
        }

        int total = n-count;

        return total;
    }

    public static void main(String[] args)
    {
        String[] array = {"1","1","2","2","3","4","1"};

        System.out.println(getDup(array));
    }
}