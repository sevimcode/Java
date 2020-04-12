package inheritance;

import objectscreating.Item;

public class Huskey extends Dog implements Trainable{  // we usually name the interface -able

//eventough you don't have anything here you can make your huskey objects with dog variables
    String furType;

    public void liveInCold (){

        System.out.println(" huskey is living in the cold");
    }

    @Override
    public void fetch( Item item ) {  // we override Trainable  inteface methods
        System.out.println("huskey is fetching " + item.name);

    }

    @Override
    public void play() {

    }

    @Override
    public void barkOncommand() {

    }
}
