package clothing.pants;


import clothing.*; // line n1

public class Jeans{
    public void matchShirt (){
        String color = Shirt.getColor ();  // line n2
        if (color.equals("Green")){
            System.out.println ("Fit");
        }
    }

    public static void main( String[] args ) {
        Jeans trouser = new Jeans ();
        trouser.matchShirt ();
    }
}
//line n1 import clothing.*;
//line n2 String color = Shirt.getColor()
// prints fit
