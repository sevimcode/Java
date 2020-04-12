package customexceptions;

public class Store{

    public static void main( String[] args ) throws InvalidOSException {
        Laptop laptop = new Laptop ();
        laptop.turnOn (); // when we get 8 9 10 we will get the exception

        try{
        laptop.setOs ( "hdhjfghjd" );  // checked
        laptop.turnOn ();              // unchecked
        }catch (InvalidOSException  | LaptopNotTurningOnException e){

            System.out.println ("Invalid Operating System");
            e.printStackTrace (); //prints customexceptions.InvalidOSException: hdhjfghjdis not a valid OS

        }
    }



}
