package oca;

public class Fieldinit{
    char c;
    boolean b;
    float f;
    void printAll(){

        System.out.println(c);  // print bos
        System.out.println(b);  // false
        System.out.println(f);  // 0.0
    }

    public static void main( String[] args ) {
        Fieldinit f = new Fieldinit();
        f.printAll();
    }



}
