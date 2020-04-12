//1. Create a class Store.
//        Instance variables: name, address, list of Item, number of items.
//        Create a constructor that accepts name and address and set
//        both values to corresponding instance variables.
//        Create a method addItem. This method doesn’t return anything and
//        it accepts Item object as parameter. Simply add given Item to the list of items
//        and increment number of items by one.
//        Create a method seeInventory. This method doesn’t take or return anything.
//        It should simply print each and every single item information.
//        Note: You can use info method that Item class has.
//Store Task Part II
//        Overload the method addItem.
//        Method doesn't take anything.
//        This method should ask user how many items to enter.
//        Method should ask Item name and price and add the Item to the items list based on the quantity user entered.
//        Collapse
//
//Store Task Part III
//Modify Store class.
//        Add instance variable totalSales.
//        Create method sellItem. Method accepts name of the Item and doesn’t return anything.
//        Check if name of the item is in the list. If it’s in stock remove from the list and
//        add the price to totalSales and give success transaction message.
//        If doesn’t exist in the list give failed transaction message and terminate the method.
//        Create method returnItem. Method takes item name and doesn’t return anything.
//        Ask user to enter the price of an item. Then create Item object from given information
//        and add to the items list. Also maintain totalSales.




        package arraylistlist;

import objectscreating.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store{

        String name;
        String address;
        ArrayList<Item> items = new ArrayList<>() ;  // you need to create an array object otherwise you will get an nulpointerexception
        int numberOfItems;
        int totalSales;

    Scanner input = new Scanner(System.in);

        public Store (String name, String address){
            this.name=name;
            this.address=address;

        }


        public void addItem(Item object){  // we didn,t include our arraylist in the constructor it just stores items

            this.items.add(object);
            this.numberOfItems++;
        }

        public void addItem(){
            int n = 0;

            System.out.println("How many items you want to enter? ");
            n = input.nextInt();
            input.nextLine();


            for (int i = 0;i < n;i++) {

                System.out.println("Name  :" + ( i + 1 ));
                String name = input.nextLine();

                System.out.println("Price :" + ( i + 1 ));
                int price = input.nextInt();
                input.nextLine();


                Item product = new Item(name,price);

                this.items.add(product); //we added to object to the arraylist of items

                this.numberOfItems++;



            }
        }

             public void sellItem(String name){


                 for (int i=0; i<items.size() ; i++){

                     if (items.get(i).name.equals(name)){

                         this.totalSales +=items.get(i).price;
                         items.remove(i);
                         System.out.println("Successful transaction");
                         this.numberOfItems--;
                         return;  // if you find the product it terminates the method

                     }

                 }
                 System.out.println(" Item is not in stock");

        }

         public void returnItem(String name){

             System.out.println("Price of returned item :" );
             int price = input.nextInt();
             input.nextLine();

             Item product = new Item(name,price); //

             this.items.add(product); //we added to object to the arraylist of items
             this.totalSales-=price;  //decreased by price because it is returned item
             this.numberOfItems++;   //additional item to our store
             System.out.println("\nreturn proccess successful");
         }



        public void seeInventory(){
            System.out.println("\nZARA Chicago Store");
            System.out.println("Total sales : " + this.totalSales);

            for (Item item : items){
                    item.printItem();}

            }
        }








