package HashExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx{

    public static void main( String[] args ) {
        Map<String ,Integer> map = new HashMap<> ();
        map.put ("first", 1);
        map.put ("second", 2);
        map.put ("third", 3);
        map.put ("fourth", 4);
        System.out.println ();

        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the number :");
        int number = input.nextInt ();

       if (map.containsValue (number)) {
       }else{
              System.out.println ("invalid  number");
              System.exit (0);
          }

       for (String key : map.keySet ()){  // the task looking for value and gives the value
           if(map.get(key) == number){
               System.out.println (key);
           break;}
       }
    }
}
