package oca;

public class loopQ20{


    public static void main( String[] args ) {
        String[][] chs = new String[ 2 ][];
        chs[ 0 ] = new String[ 2 ];
        chs[ 1 ] = new String[ 5 ];
        int i = 97;

        for (int a = 0;a < chs.length;a++) {      // assigment loop can not assign second object last 3 of them
            for (int b = 0;b < chs.length;b++) {
                chs[ a ][ b ] = "" + i;
                i++;
            }
        }

        for (String [] ca : chs){

            for (String c : ca){
                System.out.print(c+ " ");

            }
            System.out.println ();
        }
    }}
// prints
// 97 98
// 99 100 null null null