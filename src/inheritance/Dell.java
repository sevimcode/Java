package inheritance;

import inheritancepart2.Laptop;  // when you extend Laptop it automatically import the package

public class Dell extends Laptop{

    public static void main( String[] args ) {
        Dell dell = new Dell();
        dell.color = "red";   // when you have protected variable in your parent class  you can reach it as a child class
        //even though you are in different package
        Laptop laptop = new Laptop();

    }

}
