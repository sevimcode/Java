package oca;

public class tryCatchLocal{

    public static void main( String[] args ) {
        try{
            Double number = Double.valueOf ("120D");
        }catch( NumberFormatException ex){

        }
      //  System.out.println (number);    // you can not reach try block local variable
    }
}// answer compilation fail because of line 8
