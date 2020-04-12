package objectscreating;

public class Book{


     public  String title;
     public String author;  // Author author = new Author();  you can create an object here

    public int pages;


    public Book(){ // if you keep default constructor this one allows ys to create an object with it

    }

    public Book(String name){

        this.title =name;

    }
    public Book(String name,String author){

        this(name);  //constructor chaining, order is important  this(name);it should be first one in the order
        this.author=author; //this.author.name = author; if it is object from the class

    }


     public Book(String name, String author, int pages){

         this(name,author); //constructor chaining order is important this(name,author); should be first one in the order
         this.pages=pages;

     }
     public void info(){
         System.out.println("Name :" + this.title);
         System.out.println("Author :" + this.author);
         System.out.println("Pages:" + this.pages);
         System.out.println();




     }





}
