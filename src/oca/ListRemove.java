package oca;

import java.util.ArrayList;
import java.util.List;

public class ListRemove{

    public static void main( String[] args ) {


        List<String> names = new ArrayList<>();
        names.add("robb");
        names.add("bran");
        names.add("rick");
        names.add("bran");


        if (names.remove("bran")){  // remove Returns true is any element was removed from the list,
            names.remove("jon");}  // if there is no such thing false

        System.out.println(names);  // prints   [robb, rick, bran]

    }}