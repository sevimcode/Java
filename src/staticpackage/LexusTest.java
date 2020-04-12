package staticpackage;


public class LexusTest{

    public static void main( String[] args ) {


        Lexus car1 = new Lexus("LS" , 2015);

        car1.mileage = 100000;

        Lexus.evaluateCar(car1); // you can call it with it s class
    }
}