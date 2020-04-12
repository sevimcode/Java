package replit;

import constructor.Phone;

import java.util.Arrays;

public class PhonesTest{
    public static void main( String[] args ) {

            Phones ctl = new Phones();
            ctl.loadItems();
            ctl.loadPrices();
            ctl.loadMonthlyPayments();
//
//            System.out.println(ctl.items.toString());
//            System.out.println(ctl.prices.toString());
//            System.out.println(ctl.monthlyPayments.toString());

        System.out.println(ctl.getItemsLessThanAMonthlyPrice(512.0));
        ctl.updatePrice("iPad", 500);


//            Phones ctl2 = new Phones();
//            ctl2.loadWholeCatalog();
           System.out.println(ctl.getWholeCatalog().toString().trim());
//



    }
}