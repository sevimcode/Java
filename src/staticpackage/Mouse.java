package staticpackage;

public class Mouse{
    String color;
    int size;
    boolean wireless;

   public Mouse (String color, int size, boolean wireless) {
       this.color = color;
       this.size = size;
       this.wireless = wireless;

   }

   public Mouse (){

   }


   public static void main( String[] args ) {

        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();

        m2.color = "red";

        m1.color = "white";
        m2=m1;  // m2 reference variable now pointing to m1 object  we lost m2 object

       System.out.println(m2.color); // prints white because it points the m1 we lost red

       Mouse m3 = new Mouse("black", 23, true); // gets the initial values creating object with certain information is better

    }

}
