package accessModifiers;

public class Person{


    private String name;

    public Person(String name){

        this.name = name;
    }
    private Person(){  // you can make constructor private

        this.name = "Jhon";
    }


    public static void main( String[] args ) {

        Person p1 = new Person("sevim");

        p1.name = "james";  // if you want to do it in another class you can not use it because it is private belong to class

        Person p2 = new Person(); // you can not use it out side of class because this no arg cons is private

    }

}
