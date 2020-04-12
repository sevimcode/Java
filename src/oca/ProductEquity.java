package oca;

public class ProductEquity{


    String name;
    int id;

    public ProductEquity(String name, int id){

        this.name = name;
        this.id = id;
    }

    public static void main( String[] args ) {
        ProductEquity b1 = new ProductEquity("sevim", 101);
        ProductEquity b2 = new ProductEquity("sevim", 101);
        ProductEquity b3 = b1;
        System.out.println(b1 == b2);  // false they are not painting same memory location
        System.out.println(b1.name.equals(b2.name)); // true values are same
    } // prints false true
}
