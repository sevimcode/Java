package customexceptions;

import java.util.Random;

public class Laptop{

    private String os;

    public String getOs() {
        return os;
    }

    public void setOs( String os ) throws InvalidOSException {
        switch (os.toLowerCase ()){

            case "windows":
            case "linux":
            case "microsoft":
                this.os=os;
                break;
            default: throw new InvalidOSException (os + "is not a valid OS ");
        }


        this.os = os;
    }

    public boolean turnOn (){
        Random random = new Random ();
        int number =random.nextInt ( 11 );
        System.out.println (number);
        if (number>=8){  // computer does not turn on
        throw new LaptopNotTurningOnException ("laptop is not turning on");
        }
        return true;
    }

}
