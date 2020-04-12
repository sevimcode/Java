package abstraction2;

public class HomeTest{
    public static void main( String[] args ) {
        SingleHouse singlehouse = new SingleHouse();
        singlehouse.address = " 72 kenilworth";
        singlehouse.numOfRooms = 5;
        singlehouse.maxNumberOfGuest = 7;
        singlehouse.garageType = " open";
        singlehouse.cook();

        System.out.println(singlehouse);
    }
}
