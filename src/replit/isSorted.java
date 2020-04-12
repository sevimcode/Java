package replit;

public class isSorted{



    public static boolean isSort(int[] nums)
    {
        boolean check=false;
        for (int i=0; i<nums.length-1; i++){
            for (int j=1; j<nums.length; j++){
                check= nums[ i ] < nums[ j ];
            }}


        return check;
    }
    public static void main (String [] args){
        int [] array={2,3,4,5};
        System.out.println(isSort(array));

    }
}

