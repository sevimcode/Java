package polymorphism;

public class HumanScale extends Chair implements Rollable,Collapsible{
    @Override
    public void sit() {
        System.out.println("Sitting on Humanscale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Humanscale chair");

    }

    @Override
    void changeColor( String color ) {
        super.changeColor(color);
    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public void fold() {

    }

    @Override
    public void unfold() {

    }

    @Override
    public void rollBack() {

    }

    @Override
    public void rollForward() {

    }
}
