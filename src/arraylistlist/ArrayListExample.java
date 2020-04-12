package arraylistlist;

import java.util.ArrayList;

public class ArrayListExample{


    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>(); // single item in this ArrayList
        names.add("jason"); // add method take only one string
        names.add("adam");
        names.add(1 , "sevim");
        System.out.println(names);  // prints "[jason, sevim, adam]"  because we have single value in the array
        System.out.println(names.get(1)); // prints "sevim"




    }
}