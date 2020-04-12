package oca;

public class ArrayExample{

    public static void main( String[] args ) {


        String shirts[][] = new String[ 2 ][ 2 ];
        shirts[ 0 ][ 0 ] = "red";
        shirts[ 0 ][ 1 ] = "blue";
        shirts[ 1 ][ 0 ] = "small";
        shirts[ 1 ][ 1 ] = "medium";

        for (int index=0; index<2;){  // cevap 0 dan basla 2 ye git index ve idx i arttir
            for (int idx =0; idx<2;){
                System.out.print(shirts[index][idx]+ ":");
                idx++;
            }
            index++;    // red blue small medium
        }

        String s = "duke";
        int len = s.trim().length();
        System.out.println(len);

       StringBuilder sb= new StringBuilder ("duke");
        System.out.println ((s.equals (sb)));
        if ("duke".equals (sb))
        System.out.println ("one");

    }

}