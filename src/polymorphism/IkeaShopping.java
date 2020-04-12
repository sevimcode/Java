package polymorphism;

public class IkeaShopping{

    public static void main( String[] args ) {
        //  Chair chair = new Chair(); // you can not create abstract class object

        Chair chair = new Aeron(); // polymorphism
        chair.sit(); // calls the overridden version on Aeron class

        Collapsible co = new HumanScale(); // collapsible only implemented from humanscale
        co.unfold();
    }
}