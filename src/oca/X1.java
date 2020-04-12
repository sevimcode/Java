package oca;

import java.io.IOException;

public class X1{
    public void printFileContent () throws IOException {
        throw new IOException ();
    }

    public static void main( String[] args ) throws IOException {
        X1 xobj = new X1 ();
        xobj.printFileContent ();
    }


} // add printfilecontent method throws exception
// add main method throws exception
