package exceptionsexamples;


public class ClassOne{

    public static void main( String[] args ) throws Exception {

        // Dog.bark(); // does not work here because we are not catching the exception
        try {
            String s = "hello";
            System.out.println (s.charAt (30));
            Dog.bark ();  // when the method throws an checked exception you need to handle it
            System.out.println (3/0); // valid statement but gives unchecked exception


        } catch (Exception e) {   // you can put more specific exception StringIndexOutOfBoundException e
            System.out.println (e.toString ()); // it will write the exception object
                                               // prints java.lang.StringIndexOutOfBoundsException: String index out of range: 30
            System.out.println ("My exception thrown");// prints "My exception thrown"

        }

        System.out.println ("The end"); // prints "The end"

    }
}
