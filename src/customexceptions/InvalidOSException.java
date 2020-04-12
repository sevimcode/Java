package customexceptions;

public class InvalidOSException extends Exception{
    public InvalidOSException(){

    }
    public InvalidOSException (String message){ // you can change your constructor here to add message when you throw new
        super(message);


    }



}
