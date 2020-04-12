package abstraction2;

public class TownHouse extends Home{
    @Override
    public void throwParty() {
        System.out.println("townhouse party");

    }

    @Override
    public void lock() {
        System.out.println("locking townhouse");

    }

    @Override
    public void unlock() {
        System.out.println("unlocking townhouse");

    }

    @Override
    public void cook() {
        System.out.println("cooking at townhouse");

    }
    @Override
    public String toString() {
        return super.toString();
    }

    public void shareWithNeighbor(){

    }
}
