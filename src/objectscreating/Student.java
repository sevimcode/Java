package objectscreating;

public class Student{

    String name;
    String email;
    int age;

    public Student(String name){ // if you want to create a Student object you have to give a name

        this.name=name;
    }

    public void read ( ){

        System.out.println("Student " + this.name + "is reading");


    }

         public void read(int hours){

             System.out.println("Student " + this.name + "is reading for " + hours +" hours");

         }

         public void read (Book book){ // we use Book datatype Book object book

             System.out.println("Student " + this.name + "is reading " + book.title); // book.title whatever they passed in the method
      // it will take the title as a book title
         }









}
