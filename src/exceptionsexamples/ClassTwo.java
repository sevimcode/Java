package exceptionsexamples;

public class ClassTwo{

    public static void main( String[] args ) {


        try {
            String s = "hello";
            System.out.println (s.charAt ( 30 ));
          //System.out.println ( 3 / 0 ); // valid statement but gives unchecked exception
            System.out.println (new int[] {3,21,1}[5]);

        } catch (StringIndexOutOfBoundsException e) { // it will not go here
            System.out.println ( "index does not exist" );

        } catch (ArithmeticException e) {   // it will go here because we divided by zero
            System.out.println ( "invalid math" ); // prints divide


        }catch (Exception e){
            System.out.println ("unknown exceptions");
            System.out.println (e.toString ());
        }

        System.out.println ( "The end" ); // prints "The end"

    }
}





