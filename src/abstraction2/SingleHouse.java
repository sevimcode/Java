package abstraction2;

public class SingleHouse extends Home{

    String garageType;
    @Override
    public void throwParty() {
        System.out.println(" single house party");

    }

    @Override
    public void lock() {
        System.out.println("single house lock");

    }

    @Override
    public void unlock() {
        System.out.println("single house unlock");

    }

    @Override
    public void cook() {
        System.out.println("cooking in single house");

    }

    @Override
    public String toString() {

        return super.toString()+"\nGarage type : " + garageType;

    }

    public void cutGrass(){


    }
    public void shovelSnow(){


    }


}
