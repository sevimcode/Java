//create 2 flag object
//give values to f1
//assign values to the second one from first one
//the give f1 values a for string 0 for int


package objectscreating;

public class Assigmentsbetweenobjects{

    public static void main(String[] args){

        Flag f1 =new Flag();

        f1.country = "turkey";
        f1.size = 15;
        f1.material="velvet";
        f1.color="red";

        Flag f2 =new Flag();

     //   if (f2.country == null) checking the objects is null or not

        f2.country = f1.country;
        f2.size = f1.size;
        f2.material =f1.material;
        f2.color = f1.color;

        f1.country = "a";
        f1.size = 0;
        f1.material="a";
        f1.color="a";

        f1.info();
        f2.info();

        //upgrade f1 to 255 and gold

        f1.upgrade(255, "gold");  //we used our methods
        f1.info();


    }
}
