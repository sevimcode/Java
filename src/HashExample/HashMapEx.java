package HashExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx{

    public static void main( String[] args ) {
        Map < String , Integer> gradeScale = new HashMap<> ();
        gradeScale.put("A" , 90);
        gradeScale.put("B" , 80);
        gradeScale.put("C" , 70);
        gradeScale.put("D" , 60);
        gradeScale.put("F" , 50);
        gradeScale.put("F" , 40);

        System.out.println (gradeScale.get("D")); // prints 60
        System.out.println (gradeScale.get("G")); // prints null
        System.out.println (gradeScale.get("F")); // 40 overrides on 50 key should be unique
        gradeScale.remove ("F");
        System.out.println (gradeScale); //{A=90, B=80, C=70, D=60, F=40}
        System.out.println (gradeScale.containsKey ("A"));
        System.out.println (gradeScale.containsValue (80));

        System.out.println (gradeScale.keySet ());

        for (String key : gradeScale.keySet ()){
            gradeScale.remove ("A");// throws java.util.ConcurrentModificationException don't remove in the loop
            System.out.println (key);
        }
        for (String key : gradeScale.keySet ()){
            System.out.println (key + "  " + gradeScale.get (key)); // we print values
    }
}
}