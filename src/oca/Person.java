package oca;

public class Person{
    String name;
    int age;

    public Person(String name){

     //  this();   //compilation error you need to have a default constructor to chain
        setName(name);
    }

    public Person (String name, int age){
       // Person(name); // Person (name) compilation error
        setAge(age);

    }


    public void setName( String name ) {
         this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge( int name ) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String show(){
        return name + " " + age;
    }

    public static void main( String[] args ) {
        Person p1 = new Person("jesse");
        Person p2 = new Person("walter");
        System.out.println(p1.show());
        System.out.println(p2.show());

    }

}
