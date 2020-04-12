
//Create a class Item that has instance variables name and price.
//        Create a constructor that sets both the name and the price.
//        Create a method that will print the name of the item and the price
//        Create a program that will ask user to enter how many items they have.
//        Ask from the user to enter all the names and prices of each item.
//        Make an Item array that will hold all the items.
//        After you have the array loop through it and print the information of all the items

package objectscreating;
import java.util.Scanner;

public class ItemTest{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("How many item? :");
        int howMany = input.nextInt();
        input.nextLine();
        Item[] depot = new Item[ howMany ];

        for (int i = 0;i < depot.length;i++) {
            System.out.println("Item  :" + ( i + 1 )); // you can not take the input directly to the array
            String item = input.nextLine();

            System.out.println("Price :" + ( i + 1 ));
            int price = input.nextInt();
            input.nextLine();


            depot [i]= new Item(item, price);  // everytime you need to create an object to put in the array
                                                //without object you will get nullPointerException
        }                                       //because of encapsulation you can not assign directly to depot.item = input.nextLine();

             for (Item iii : depot){
                 iii.printItem();

             }

    }
}