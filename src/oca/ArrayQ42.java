package oca;



public class ArrayQ42{
    public static void main( String[] args ) {


        String[][] arr = { { "A" , "B" , "C" } , { "D" , "E" } };
        for (int i=0; i<arr.length ; i++){
            for (int j=0; j<arr.length ; j++){
                System.out.println (arr[i][j] + " ");
                if (arr[i][j].equals ("B")){
                    break;
            }}
            continue;
        }


    } // A B D E skip C after B
}