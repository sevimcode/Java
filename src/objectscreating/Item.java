package objectscreating;

public class Item{

    public String name;
    public int price;
    int size;

    public Item(String name, int price){
        this.name=name;
        this.price=price;

    }

    public Item(String name, int price, int size){   //overloaded constructor
//        this.name=name;
//        this.price=price;
//        this.size = size;
        this(name,price);  // we call constructor in another constructor. it is called constructor chaining.
        this.size=size;
    }


    public void printItem(){

        System.out.println("\nName: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("----------------");


    }






}
