package polymorphism3;

public class Person{

    private String name;

    public Person(String name){
        setName(name);
    }

    public void info(){

        System.out.println("Name : " + this.name);

    }

    // p1.hasSameName(p2);

    public boolean hasSameName(Person person){
        return this.getName().equalsIgnoreCase(person.getName());
    }


    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }





}

