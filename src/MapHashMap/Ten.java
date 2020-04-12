package MapHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ten{

    public static void main( String[] args ) {

        Map<String, String> passwords = new HashMap<> (); // Map is an interface that's why we use Hash Map class

        passwords.put ("surucu","12345");
        passwords.put ("surucu","678585");
        passwords.put ("sedat","678585");
        passwords.put ("gul","678585");
        passwords.put ("ikbal","678585");
        passwords.put ("murat","678585");
        System.out.println (passwords.size ()); // it will give 1 keys needs to be unique overrides on it

        System.out.println ( passwords.get ("surucu")); //678585

        passwords.remove ("surucu"); // gives boolean

        Set <String> setofkeys = passwords.keySet ();

        for (String key : setofkeys){

            System.out.println (passwords.get (key));
        }



    }




}
