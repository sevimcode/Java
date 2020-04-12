package polymorphism2;

public class Dog extends Animal implements Trainable{

    @Override
    public void breath() {
        System.out.println("dog");
    }

    @Override
    public void bark() {

    }
}
