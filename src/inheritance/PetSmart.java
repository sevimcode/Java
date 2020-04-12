package inheritance;

public class PetSmart{

        public static void main( String[] args ) {
            Huskey huskey = new Huskey();
            huskey.name = "Rex";
            huskey.age = 3;
            huskey.bark();  //dog is barking
            huskey.eat();    // dog is eating
            System.out.println(huskey.name); // rex // Huskey extends Dog
            huskey.furType = "special fur";  // furtype is belong to husky class

        }
    }

