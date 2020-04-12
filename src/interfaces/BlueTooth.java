package interfaces;

public interface BlueTooth{


    int MODEL = 2015; // public static final int age=0; //any variable by default you have static final

    public abstract void blueToothOn(); //by default your method have "public abstract"


     default void blueToothOff( ) { //you can have default methods in the interfaces default is not the access modifier default

    }

    public static void connectAPhone() {  // you can have static method in interface

    }

     }




