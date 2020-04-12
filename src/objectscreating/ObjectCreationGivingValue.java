package objectscreating;

public class ObjectCreationGivingValue{
    public static void main(String[] args){


        String name = "james";
        Flag f1 = new Flag();  // created an object from Flag data type
        System.out.println(f1.color);  // prints null we did not give value to it

        f1.country = "USA";   //object name. instance variable = value;
        f1.size = 5;
        f1.material="fabric";
        f1.color="red/white";

        System.out.println( f1.country );
        System.out.println( f1.material );
        System.out.println( f1.size );
        System.out.println( f1.color );

        f1.flap();  //invoke the method of the class

        f1.info();  //info method prints everything
//        Country :USA
//        Size :5
//        Color :red/white
//        Material : fabric

        Flag f2 = new Flag(); // we creted new object f2
        System.out.println(f2.country); // prints null we did not put any value

           f2.info();  // info still works but gives the values of f2 "null" " 0"
//        Country :null
//        Size :0
//        Color :null
//        Material :null
//
         f1.upgrade(10, "wood");
         f1.info();

    }
}