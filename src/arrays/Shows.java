package arrays;

import java.util.Arrays;

public class Shows{

    public static void main( String[] args ) {

        String [] shows = { "Doctor Who", "Friends", "Game of Thrones", "Grey's Anatomy", "Prison Break"};

        Arrays.sort(shows);
        int i=1;
        for (String s : shows){
            System.out.println("#" +i + " " +s);
             i++;}
    }
}
