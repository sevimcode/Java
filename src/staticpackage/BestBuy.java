package staticpackage;



public class BestBuy{  // static members belongs to class not the objects tum objectlerde ayni degeri alir.

    String location;
    static int numOfComputers = 50; // it will be the same and shared for any objects from BestBuy class
    static String day = "monday";
    static {
        System.out.println("run first ");
        numOfComputers =50; //guarantee that it will run first
    }

    static {
        System.out.println("run second ");
        if (day.equals("monday")){
            numOfComputers=60;
        }else{
            numOfComputers =30;   // we will have reassignment here
        }

    }

    public static void printComputer(){
        System.out.println(numOfComputers);
    }

    public static void main( String[] args ) {

        BestBuy store1 = new BestBuy();
        BestBuy store2 = new BestBuy();

        System.out.println(BestBuy.numOfComputers); // same number 50

        store1.numOfComputers--; // even though is decreased from store1 store2 number is the same

        System.out.println(store2.numOfComputers); // same number  50


    }


}
