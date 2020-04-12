package stringbuilder;

import java.util.ArrayList;


public class InsertWord{

    public static ArrayList<String> insertWord ( ArrayList <String> sen){


       for (int i =0; i< sen.size() ; i++) {
           if (sen.get(i).length()%2 == 0){
               StringBuilder sb= new StringBuilder(sen.get(i));
               int k=sen.get(i).length()/2;
               sb.insert(k,"HELLO");  //insert hello word in the middle of the string object
               sen.set(i, sb.toString()); // set the object in the same position
           }

       }

        return sen;
    }

    public static ArrayList<String> insertWord ( ArrayList <String> sen, String word){ // dynamic


        for (int i =0; i< sen.size() ; i++) {
            if (sen.get(i).length()%2 == 0){
                StringBuilder sb= new StringBuilder(sen.get(i));
                int k=sen.get(i).length()/2;
                sb.insert(k,word);  //insert hello word in the middle of the string object
                sen.set(i, sb.toString()); // set the object in the same position
            }

        }

        return sen;
    }
}
