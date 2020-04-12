package stringbuilder;

import utilities.MyCollection;

import java.util.ArrayList;

import static stringbuilder.InsertWord.insertWord;

public class InsertWordTest{


    public static void main( String[] args ) {

        ArrayList <String> arr = MyCollection.randomArrayList(5);   // creates random arraylist from our utilies package
//        ArrayList <String> arr = new ArrayList<>(5);
//        arr.add(0, "mello");
//        arr.add(1, "yello");
//        arr.add(2, "mal");
//        arr.add(3,"mala");

        System.out.println( insertWord(arr));
        
    }
}
