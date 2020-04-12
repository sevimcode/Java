package encapsulation;

public class ChairTest{

    public static void main( String[] args ) {
        Chair chair = new Chair();
    //chair.model = "ikea";   //complains because it is private
     //   chair.size = 15;         // complains because it is private

        chair.setModel("ikea");
        chair.setSize(15); // now I access it with size
        System.out.println(chair.getSize());

    }


}
