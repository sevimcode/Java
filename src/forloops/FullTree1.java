package forloops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FullTree1 {

    public static void main ( String[] args ) {



    int n=10;
    for (int i = 0; i<n; i++){
        for (int b=0; b<n-i; b++)
            System.out.print (" ");
            for (int y =0; y <2*i+1; y++)
                System.out.print ("*");

        System.out.println ();}

    }


}
