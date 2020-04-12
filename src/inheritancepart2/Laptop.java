package inheritancepart2;

import inheritance.Dog;

public class Laptop{



    String model;
    int memorySize;
    protected String color; // this variable available in the subclasses of laptop Dell MacBook Lenovo
    public static int numberOfLaptops;


    public Laptop(){
        super();
        System.out.println("laptop constructor");

    }



    public void turnOn(){
        System.out.println(this.memorySize); // it is about current object prints current object memorysize
        System.out.println("Laptop is opening");
    }

    public Dog getMyDog(){  // I created this method to show covariant type on lenovo
    Dog dog = new Dog();
    return dog;
}

    public static void s(){

        System.out.println("this is static  method ");

}



}
