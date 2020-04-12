package wrapperclass;

public class Parking{

    public static void main(String[] args){

        int i= 35;    // this is primitive
        Integer i2 = new Integer(35);  // this is object wrapper class

        Integer age = 25; // same thing with the top one auto boxing

        Integer ii =i;  // we changed the int to object integer wrapper class int -> object  BOXING

        int something = ii;  // we changed  object to int  object -> int     UNBOXING

    }




}
