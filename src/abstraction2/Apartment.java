package abstraction2;

public class Apartment extends Home{



    @Override
    public void throwParty() {
        System.out.println("throwing part on my apartment");

    }

    @Override
    public void lock() {
        System.out.println(" I am locking my apartment");

    }

    @Override
    public void unlock() {
        System.out.println(" I am unlocking my apartment");

    }

    @Override
    public void cook() {
        System.out.println("I am cooking in my apartment");
    }

    @Override
    public String toString() {
        return super.toString();

    }


}
