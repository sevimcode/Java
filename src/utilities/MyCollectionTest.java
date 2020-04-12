package utilities;

import java.util.ArrayList;
import java.util.List;

import static utilities.MyCollection.*; // you need to import for static methods


public class MyCollectionTest{

    public static void main( String[] args ) {

        List <String> sen = new ArrayList<>();
        sen.add("sevim");
        sen.add("sedat");
        sen.add("sedat");
        sen.add("sedat");
        sen.add("ikl");
        sen.add("ikbal");


//       sen = getStringList();  //you call call your method with it's name  you can store it in List
//        System.out.println(sen);
//
//       System.out.println(getIntegerList());
//       List <Integer> m = getIntegerList();  // you can catch it with same type of List

     //  System.out.println(MyCollection.filterList(sen, 5)); // if you don't import Mycollection you need to write front of method

//        List <String> k = removeDuplicates(sen); //we catched it stored it
//        System.out.println(k);

        System.out.println(removeDuplicates1(sen));




   }
}