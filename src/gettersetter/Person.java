package gettersetter;

public class Person{



        private String firstName;
        private String lastName;
        private int age;


//        public toString(){
//
//            System.out.println (firstName + " | " + lastName + " | " + age);
//
//        }

        public Person(){
            this.firstName = "undefined";
            this.lastName = "undefined";
            this.age = -1;



        }

        public Person(String name, String lastName, int age){
            firstName=name;
            this.lastName=lastName;
            this.age=age;
        }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }
}


