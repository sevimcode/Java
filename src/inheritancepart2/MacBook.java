package inheritancepart2;

public class MacBook extends Laptop {

    public MacBook(){
        super();
        System.out.println("macbook constructor");
    }

    public void appleID(){
        super.memorySize = 45; // we access to parent class with super keyword variable and assign it to 45


    }

    public static void main( String[] args ) {


        MacBook macbook = new MacBook();
        macbook.color = "Gray";

        macbook.numberOfLaptops =23;
        System.out.println(macbook.numberOfLaptops);  //23
        System.out.println(macbook.numberOfLaptops);  //23 static is shared inherited an accessible
    }




}
