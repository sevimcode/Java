package finalpackage;

public class BagTest{

    public static void main( String[] args ) {

        Bag b1 = new Bag();
        Bag b2 = new Bag();

        System.out.println(b1.color);  // prints grey
        System.out.println(b2.color); // print grey   because instance variable is Grey in the class as a final


       // Bag b4 = new Bag(); it will get color red from first no argument constructor
        // Bag b2 = new Bag ("black"); if you use second constructor with argument one time you will give final color
        //can not be changed anymore


    }



}
