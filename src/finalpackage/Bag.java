package finalpackage;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Bag{
    //option 1
    final String color = "Grey";  //final instance variable must be initialized once
    //once it is initialized then value of the color can not be changed

    // option 1: initialize it right away. Give the value to instance variable when you declare it
    //
    final int size;
       {
        size=4;    // option 3: you can use initializing block
        }


// option 2 // initialized the final variables in the constructor. Because instance variables can not be used without
    //creating an object

//      final String color; // you can not initialized here this option 2

//    final static int totalBags;
//
//    static {
//
//        totalBags = 25;
//    }
//
//    public Bag(){
//
//        this.color = "Red";
//    }
//    public Bag(String color){
//
//        this.color = color;      // you need to initialized here to overloaded constructor
//    }
//
}
