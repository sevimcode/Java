package oca;

public class Test11{
    public void updatePrice (Product1 product, double price){
        price = price*2;
        product.price = product.price +price;
    }

    public static void main( String[] args ) {
        Product1 prt = new Product1 ();
        prt.price = 200;
        double newPrice = 100;

        Test11 t= new Test11 ();
        t.updatePrice (prt, newPrice);
        System.out.println (prt.price + " : " + newPrice);
    }
}// prints 400.0 : 100.0
