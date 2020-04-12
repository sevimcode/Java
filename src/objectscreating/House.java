//Part I 
//        Create a class House 
//        Instance variables: type, address, numRooms
//        Methods:
//        info: this method should simply print details of house.
//        Part II
//        Create a program that asks from user details of the house through
//        console and create object from House. And print the details of created House.
//        Collapse


package objectscreating;


import java.util.Scanner;

public class House{    //you can use the House data type anywhere in the project

    String type;
    String address;
    int numRooms;

    public void info (){

        System.out.println("\nhouse type: " + this.type);
        System.out.println("house address: " + this.address);
        System.out.println("number of rooms: " + this.numRooms);
    }


    public static void main(String[] args){  // we usually create user program in different file

        Scanner input = new Scanner(System.in);

        House ev = new House();
        ev.type = "mexican";
        ev.address = "kenilworth";
        ev.numRooms = 10;

        ev.info();

        House ev2 = new House();

        System.out.println("what is your house type? ");
        ev2.type = input.nextLine ();
        System.out.println("what is your house address? ");
        ev2.address = input.nextLine ();
        System.out.println("number of rooms? ");
        ev2.numRooms = input.nextInt ();

       ev2.info();
    }



}
