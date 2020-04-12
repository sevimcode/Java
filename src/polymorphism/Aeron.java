package polymorphism;

public class Aeron extends Chair implements Rollable{
    @Override
    public void sit() {
        System.out.println("Sitting on Aeron chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Aeron chair");

    }

    @Override
    void changeColor( String color ) {
        super.changeColor(color);
    }

    @Override
    public void rollBack() {

    }

    @Override
    public void rollForward() {

    }
}
