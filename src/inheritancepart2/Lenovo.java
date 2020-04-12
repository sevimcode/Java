package inheritancepart2;

import inheritance.Dog;
import inheritance.Huskey;

public class Lenovo extends Laptop{


    String model; // lenovo inherit the model already
    static int numberOfLaptops; //you already inherited but you override on it if you don't have your static you will use laptop variable


    public static void main( String[] args ) {
        Laptop laptop = new Laptop();
        laptop.color = "white";
        Lenovo lenovo = new Lenovo();
        lenovo.model = "Lenovo X4";
        lenovo.memorySize = 12;
        lenovo.color ="gray";
        lenovo.turnOn();

    }

    @Override
    public void turnOn() {
     //  super.turnOn();   //you don,t see it but by default we have super.turnOn() here prints "laptop is opening"
        System.out.println(this.model + " laptop is turning on in Lenovo class");

    }

   @Override
    public Huskey getMyDog(){   //I can return Husky here instead of Dog  because it is covariant of it  public Dog getMyDog(){


        return null;
    }

  //  @Override  //you can not use @Override here because you can not override in this way
    public static void s(){ //This is method hiding without @Override
        System.out.println("Trying to override static method");

    }


}
