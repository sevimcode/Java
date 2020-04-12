package interviewquestions;

import java.util.ArrayList;

public class MissingNumber{


    public static void main( String[] args ) {

        ArrayList<Integer> missing = new ArrayList<Integer>();
        int num[] = { 3,4,5,6,7,10 };
        int j = num[0];
        for (int i=0;i<num.length;i++)
        {
            if (num[i]==j)
            {
                j++;
                continue;
            }
            else
            {
                missing.add(j);
                i--;
                j++;
            }
        }
        System.out.println(missing);

    }
}
