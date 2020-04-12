package constructor;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Sky{

    String color;
    int visibleStars;

   public Sky(){ // this is the constructor it is actually hidden

       System.out.println("hi there!"); // nobody prints anything in constructor
   }

    public Sky (String colorCode){
       this.color =colorCode;
    }

    public Sky(String colorCode, int visibleStars){ // you can use same name with the instance variables in the constructor parameter
        this.color =colorCode;
        this.visibleStars= visibleStars;             // we overload the constructors
    }


    public static void main(String[] args){ // normally we don't put main method in the same class
        Sky sky = new Sky();  // className referenceName = new Constructor;

        //prints "hi there!"  every time when you  create an object

        Sky sky1 = new Sky ("blue");  // you must at least pass the color for creating an object.
        System.out.println(sky1.color); // if you don't have Sky() default one you lost the default when you change  the constructor

        Sky sky2 = new Sky("red", 500);
        System.out.println(sky2.color);
        System.out.println(sky2.visibleStars);


    }


}
