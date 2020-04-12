package oca;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person1Test{

    public static void checkAge ( List  <Person1> list , Predicate<Person1> predicate){
        for (Person1 p: list){
        if (predicate.test ( p )){
            System.out.println (p.name+ " ");
        }

    }}

    public static void main( String[] args ) {
        List <Person1> iList = Arrays.asList (new Person1 ( "Hank", 45 ),new Person1 ( "Charlie", 40 ),new Person1 ( "Smith", 38 ) );

        checkAge ( iList,p-> p.getAge ()>40);
    }

//The Predicate interface represents an operation that takes a single input and returns a boolean value.
  //checkAge ( iList,p-> p.getAge ()>40);  answer

}
