package objectscreating;

public class StudentTest{


    public static void main(String[] args){
        Student studentOne = new Student("James") ;

        studentOne.read(15);

        Book book1 = new Book("java","cybertek",20);

        studentOne.read(book1);



    }




}
