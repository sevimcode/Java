package oca;

public class Test3${

    int x,y;

    public Test3$(int x, int y){

        initialize (x,y);
    }
    public void initialize(int x, int y){
        this.x = x*x;
        this.y = y*y;
    }

    public static void main( String[] args ) {
        int x=3; int y=5;
        Test3$ obj = new Test3$(x, y);
        System.out.println(x+ " " + y);
    }
}  // prints 3 5
