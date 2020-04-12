//Create a class Driver.
//        Add instance variables: name, age, location
//        Encapsulate them and provide public getters and setters.
//        Throw an Exception type in setName method if entered name is consist of 2 or more words.

package exceptionsexamples;

public class Driver{
    private String name;
    private int age;
   private String location;

    public String getName() {
        return name;
    }

    public void setName( String name ) throws Exception {
        if (name.trim ().split ( " " ).length>=2){
            throw new Exception(name+ " was invalid");}
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) throws Exception {
        if (age<0 || age>100){
            throw new Exception();}
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation( String location ) throws InvalidLocationException { //if we have digit in location throws custom exception

       for (int i = 0; i<location.length(); i++) {
           if (Character.isDigit (location.charAt (i) )){
               throw new InvalidLocationException (location+ " invalid location ");
               }
       }
        this.location = location;
    }
}
