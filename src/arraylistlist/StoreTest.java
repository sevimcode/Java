package arraylistlist;

import objectscreating.Item;


public class StoreTest{

    public static void main(String[] args){

       Store zara = new Store("Zara", "72 Kenilworth ave");
        Item item1= new Item("coat", 200);
        Item item2= new Item("pen", 500);
        Item item3= new Item("skirt", 200);

        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);

        zara.addItem(); // this is the method ask user to give information about new items will be added to your store zara

        System.out.println(zara.numberOfItems);

        zara.seeInventory();
        zara.sellItem("coat");

        zara.seeInventory();
        System.out.println(zara.totalSales);

        zara.returnItem("pants");
        zara.seeInventory();

    }



}
