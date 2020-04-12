package customexceptions;

public class LaptopNotTurningOnException extends RuntimeException{

    public LaptopNotTurningOnException(String message){
        super(message); // this is better practice

      //  System.err.println (this.toString ()+ " " + message); // you can give message this way

    }


}
