package staticpackage;

import java.util.ArrayList;
import java.util.List;
import static staticpackage.StringCreating.*;

public class StringCreatingTest{

    public static void main( String[] args ) {

        List <String> sen = new ArrayList<>();
        sen.add("sevim");
        sen.add("sedat");
        sen.add("sedat");
        sen.add("sedat");
        sen.add("ikbal");
        sen.add("ikbal");
        System.out.println(getStringList());

      //  System.out.println(getIntegerList());

       // System.out.println(filterList(sen, 5));
        System.out.println(removeDuplicates(sen));
    }
}