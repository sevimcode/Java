package inheritancepart2;

public class Sun extends Object{   // by default your class is like that but you don't see it

    public Sun(){
        super();
    }

    public static void main( String[] args ) {
        Laptop.numberOfLaptops = 34;
       Lenovo.numberOfLaptops = 12;

        System.out.println(Laptop.numberOfLaptops);
        System.out.println(Lenovo.numberOfLaptops); //once you created new numberoflaptops will be have its own
    }
}
