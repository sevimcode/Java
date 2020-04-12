//Create a class Person. 
//        create instance variables for Person as below:  name, gender, age, height, weight 
//        2. Encapsulate all instance variables. 
//        Modify setter methods for gender, age, height and weight. 
//        Set age only with valid age. Valid age must be between 0 to 120. If invalid age print “invalid age” and don’t set. 
//        Set gender with valid gender. It must be either male or female. Otherwise give proper message and don’t set the invalid gender.
//          Both hight and weight should be positive values. Otherwise give proper message. 


package encapsulation;


public class Person{
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender( String gender ) {
        if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))
        this.gender = gender;
        else
            System.out.println("invalid gender");
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        if (age>=0)
        this.age = age;
        else
            System.out.println("invalid age");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight( int height ) {
        if (height>0)
        this.height = height;
        else
            System.out.println("invalid height");
    }

    public int getWeight() {
        return weight;
    }

    public void info(){

        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
        System.out.println("Height :" + height);
        System.out.println("Weight :" + weight);




    }
    public void setWeight( int weight ) {
        if(weight>0)
        this.weight = weight;
        else
            System.out.println("invalid weight");
    }
}
