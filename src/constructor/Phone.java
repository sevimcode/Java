//Create a class Phone.
//        Instance variables: touchscreen, model, memory, color, phoneNumber.
//        Create a constructor that accepts two parameters(model, color) and
//        set to corresponding instance variables. Overload the constructor
//        that accepts 4 parameters(model, color, memory, touchscreen). Set values and check memory.
//        If given memory is negative value then print “invalid memory” and don’t set memory value.
//        Otherwise set the memory value.


//Create a method text that accepts long(phone number) and String(text) and returns boolean.
//        Check given number length and text body.
//        Print: “%textBody sent to %givenPhoneNumber”
//        if length is 10 and text body is not empty then return true;
//        Print: “Invalid phone number or text body” and return false if otherwise.
//   Create a method call that accepts long (phone number).
//        Print “Calling to %phoneNumber” if phone number length is 10.
//        Print “Invalid phone number” if otherwise.
//



        package constructor;



import java.util.Scanner;

public class Phone{

    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model , String color){
        this.model = model;
        this.color = color;
    }

    public Phone(String model , String color , int memory , boolean touchscreen){
        Scanner scanner = new Scanner(System.in);

        this.model = model;       // this constructor set the memory value if it is positive
        this.color = color;
        this.touchscreen = touchscreen;
        if (memory < 0) {
            System.err.println("\ninvalid memory");
            System.err.println("put valid memory");
            memory = scanner.nextInt();
            this.memory = memory;
            // err gives red color to message
        } else {
            this.memory = memory;
        }
    }

    public boolean text(long phoneNumber , String text){
        String phoneN = "" + phoneNumber;
        boolean check = false;

        if (!text.equals("") && phoneN.length() == 10){
            System.out.println(text + " sent to " + phoneNumber);
            check = true;}
        else
            System.out.println("Invalid phone number or text body");

    return check;
    }
    public void checking(long phoneNumber ){
        String phoneN = "" + phoneNumber;
       if (phoneN.length()==10)
        System.out.println("Calling to "+ phoneNumber );
       else
           System.out.println("invalid phone number");

    }


    public void info(){

        System.out.println("Model :" + this.model);
        System.out.println("Color :" + this.color);
        System.out.println("Memory :" + this.memory);
        System.out.println("Touchscreen :" + this.touchscreen);
    }





}