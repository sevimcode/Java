package replit;

import java.util.Arrays;

public class BracketTheWord{

    public static void main(String[] args){
        System.out.println(coverString("java methods" , "me")); //java [me]thods
    }

    public static String coverString(String main1 , String coverME){
        String word = "";

        if (main1.contains(coverME))
        {

            String s = "[" + coverME + "]";
            word = main1.replace(coverME,s);



        } else {
            word = "[" + main1 + "]";}


            return word;

        }
    }
















