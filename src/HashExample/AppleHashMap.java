package HashExample;


import java.util.HashMap;
import java.util.Map;

public class AppleHashMap{

    public static void main( String[] args ) {

        String  str = "aapppleee";
        Map <String , Integer> map = new HashMap<> ();

        for (int i = 0; i<str.length () ; i++){

            String key= String.valueOf (str.charAt (i));
            if (!map.containsKey (key)){ // we found the uniques and gave them 1 as a value
                map.put (key, 1);
                continue;
            }
            map.put (key,map.get (key)+1);  // if contains adds 1 to the value
        }

        System.out.println (map);

    }

}
