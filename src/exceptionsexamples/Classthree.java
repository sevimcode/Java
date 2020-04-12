package exceptionsexamples;

public class Classthree{


    public static void main( String[] args ) {

        try{

           Thread.sleep ( 1000 );
           Dog dog =null;
           int a = dog.age;


        } catch (InterruptedException | NullPointerException a) { // you can use | or but use only one reference
            //the exceptions should be in same level there should not be parent child relationship
            System.out.println ("Thread exception");

//        }catch (NullPointerException e){
//            System.out.println (" My nullpointer exception");


        }
    }





}
