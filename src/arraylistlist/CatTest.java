package arraylistlist;

import java.util.ArrayList;

public class CatTest{


    public static void main(String[] args){
        ArrayList<Cat> catsForSale = new ArrayList<>();

        Cat cat1 = new Cat();
        cat1.color ="white";
        cat1.age= 13;
        catsForSale.add(cat1);
        Cat cat2 = new Cat();
        cat2.color ="yellow";
        cat2.age= 1;
        catsForSale.add(cat2);

        System.out.println("--------------");
        System.out.println(catsForSale);  // gives the address of the array "[arraylistlist.Cat@355da254, arraylistlist.Cat@4dc63996]"

        Cat s;
        for (int i =0; i<catsForSale.size() ; i++){ // looping cats collection to print

            System.out.println("\nCat#" + (i+1));
            System.out.println("Cat color: " + catsForSale.get(i).color);
            System.out.println("Cat age : " + catsForSale.get(i).age);
        }
    }
}
