package accessModifiers;

import objectscreating.Book;

public class Library{


    public static void main( String[] args ) {
        Book b1 = new Book();
     //   b1.title = "harry potter";
        // why we can not use title because of access modifier
        // Book class is in different package than Library class

        //----------------we made the instance variables public ------------!!!

        b1.title = "harry potter"; //now it works

        //----------------we made the instance variables private ------------!!!

       // b1.title = "harry potter"; // we can not use title because its private private scope is in the class


    }


}
