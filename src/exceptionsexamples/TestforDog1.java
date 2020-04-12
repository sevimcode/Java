package exceptionsexamples;

public class TestforDog1{

    public static void main( String[] args ) {
        Dog1 dog1 = new Dog1 ();
        try {
            dog1.setAge ( 100 );
        } catch (DogInvalidAgeException e) {
            System.out.println ("invalid age");
            System.out.println (e.toString ()); // prints exceptionsexamples.DogInvalidAgeException
        }
        System.out.println (dog1.age);


    }



}
