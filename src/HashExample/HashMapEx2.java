package HashExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapEx2{
    public static void main( String[] args ) {


        Map<Integer, Integer> map = new HashMap<> ();
        map.put (1,30);
        map.put (2,30);
        map.put (3,40);
        map.put (4,60);
        map.put (5,60);
        map.put (6,30);

        Set <Integer> set = new HashSet<> ();

       for (Integer key : map.keySet ()) { // idea of set is not allow duplicates
           set.add (map.get (key));
       }
        System.out.println (set);   // prints unique values
    }
}