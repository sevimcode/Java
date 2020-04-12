package objectscreating;

public class BookStore{


    public static void main(String[] args){

        Book book1 = new Book("java", "cybertek",200);

        Book book2 = new Book("automation", "smith",20);
        Book book3 = new Book("tech", "smith",20);
        Book [] myBooks = new Book[3];
        myBooks[0]=book1;
        myBooks[1]=book2;
        myBooks[2]=book3;

         myBooks[0].pages = 50;
       for (Book eachbook : myBooks  ){ //print out all the collection all the element of the myBook array
           System.out.println(eachbook.title + " has " + eachbook.pages + " pages"); // will print every objects names
       }
//        java has 50 pages
//        automation has 20 pages
//        tech has 20 pages


        System.out.println(book2);  //this will print objectscreating.Book@355da254 you need a variable name with object name



        for (int i = 0, j=50; i< myBooks.length ; i++, j+=100){

            myBooks[i] .pages =j;  // assign 50, 150 and 250 to pages

        }

        for (Book eachbook : myBooks  ){ // another methos for printing calling info method
            eachbook.info();
        }

    }


}
