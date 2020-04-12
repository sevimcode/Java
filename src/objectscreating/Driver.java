package objectscreating;

public class Driver{

    public static void main(String[] args){


        Car car1 = new Car();
        car1.make = "lexus";
        car1.mileage = 5000;
        car1.year = 2019;
        car1.sportaddition= true;

        System.out.println(car1.mileage);
        car1.drive("Downtown");
        System.out.println(car1.mileage);
        car1.drive(250);
        System.out.println(car1.mileage);
        car1.drive();

    }
}