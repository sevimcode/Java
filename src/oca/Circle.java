package oca;

public class Circle{
    double radius;
    public double area;

    public Circle( double r ) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double r ) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


    public static void main( String[] args ) {
        Circle c1 = new Circle (17.4);
        c1.getArea ();

    }
}// how do you encapsulate correctly?
// a.remove the field area
// b:  return Math.PI * radius * radius; return method should be like this