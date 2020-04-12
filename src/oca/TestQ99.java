package oca;

public class TestQ99{

    public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return var + " : " + stVar;
    }

    public static void main( String[] args ) {
        TestQ99 t1 = new TestQ99 ();
        t1.var = 300;
        System.out.println (t1);
        TestQ99 t2 = new TestQ99 ();
        t2.stVar = 300;
        System.out.println (t2);
    }


}
