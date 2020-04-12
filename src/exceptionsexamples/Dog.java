package exceptionsexamples;

public class Dog extends ClassOne{
    int age;

    public void setAge(int age) throws Exception{

        if (age<0 || age>35 ){
            throw new RuntimeException (age + "is an invalid age");
        }
        this.age = age;

    }
     static void bark() throws Exception{

         System.out.println("Dog is barking");
         throw new Exception(); // explicitly calling an exception you have to handle it



   }






}
