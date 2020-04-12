package polymorphism2;

public class Park{
    public static void main( String[] args ) {
        GermanShepard germanShepard = new GermanShepard(); // be yourself
        Dog dog= new GermanShepard(); // be class above you
      //  dog.age; // does not see "age" even though it is germanshephard instance variable just see the parent variables
        Animal animal = new GermanShepard();
        animal.breath(); // will write germanshepherd because we override it
        Animal animal2 = new Dog();
        animal2.breath(); // will write dog
        Animal animal3 = new Dog();
        Trainable dog1 = new GermanShepard(); // you can be trainable if your parent implements trainable or yourself
        Trainable d = new Dog(); // dog implements trainable
        String s= d.name; // ALWAYS ACCESS TO REFERENCE METHODS AND VARIABLES



    }


}
