package abstraction2;

public abstract class Home{

    int numOfRooms;
    String address;
    int maxNumberOfGuest;

    public Home(){

    }

    public abstract void throwParty();

    public abstract void lock();

    public abstract void unlock();

    public abstract void cook();

    @Override
    public String toString() {
        return "Number of Rooms :" + numOfRooms +"\nAddress : " + address +"\nMaximum number of guests : " + maxNumberOfGuest;

    }
}
