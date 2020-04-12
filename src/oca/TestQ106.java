package oca;

public class TestQ106{

    int x, y;
    public TestQ106(){
        initialize(x,y);
    }



    public void initialize (int x, int y){
        this.x = x*x;
        this.y = y*y;
    }

    public static void main( String[] args ) {
        int x= 3, y=5;
    //    TestQ106 obj = new TestQ106 (x,y); // compilation error
        System.out.println (x+ " " + y);
    }
}
