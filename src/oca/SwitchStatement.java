// what we can do for truedone print

package oca;

public class SwitchStatement{

    public static void main( String[] args ) {
        String opt = "true";
        switch(opt){
            case "true":
                System.out.println("true");
                break;
            default:
                System.out.println("*****"); // if there is no case run default runs


        }
        System.out.println("Done");
    }
} // prints true done
