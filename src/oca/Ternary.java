package oca;

public class Ternary{

    public static void main( String[] args ) {


        String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")){
            res = "Walter";
            System.out.println (res);
        }
        else if (stuff.equals("Movie")) {
            res="White";
            System.out.println (res);
        } else{
            res = "No Result";
            System.out.println (res);
        }

        res= stuff.equals ( "TV" ) ? "Walter" : stuff.equals ( "Movie" ) ? "white" : "No Result" ;
        System.out.println (res);

    }
}