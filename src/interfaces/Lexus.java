package interfaces;

public class Lexus extends Car implements Camera,BlueTooth { // better practice child class gets the additional methods


    static int MODEL = 2019;



    @Override
    public void blueToothOn() { // you have to override to your interface methods

    }

    @Override
    public void backCameraOn() {

    }

    @Override
    public void leftCameraOn() {

    }


    public static void main( String[] args ) {
        Lexus car1 = new Lexus();
        BlueTooth.connectAPhone(); // you CAN NOT override static methods in your interface because you can call it with its class name

    }
}
