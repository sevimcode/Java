package abstraction2;

public abstract class Browser {

    String name;
    double size;
    double version;

    public abstract void launch();  // you need to implement all of the abstract methods in the child classes

    public abstract void browse(String url);

    public abstract int getNumOfTabs();

    public void close(){   //regular method

        System.out.println("Browser is closing");
    }

    @Override
    public String toString() {  // the abstract class can override parent class from object class

        return super.toString();
    }
}


