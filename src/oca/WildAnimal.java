package oca;

public class WildAnimal extends Animal{
    String bounds;

    WildAnimal (String bounds){
     super();
     this.bounds = bounds;
    }

    WildAnimal (String type, int maxSpeed, String bounds){
super(type, maxSpeed);
this.bounds = bounds;

    }

    public static void main( String[] args ) {
        WildAnimal wolf = new WildAnimal ("Long");
        WildAnimal tiger = new WildAnimal ("Feline", 80, "short");
        System.out.println (wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds) ;
        System.out.println (tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
    }

}
