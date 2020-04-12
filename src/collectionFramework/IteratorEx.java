package collectionFramework;

import java.util.*;

public class IteratorEx{

    public static void main( String[] args ) {


        Set<String> names = new HashSet<> ();
            names.add ("ben"  );
            names.add ("joe") ;
            names.add ( "james" );
            names.add ("sara") ;
            names.add ("adam");

        //   Iterator <dataType> refName = collectionName. iterator();
            Iterator<String> it= names.iterator ();
           while(it.hasNext ()){

           String name = it.next ();
               System.out.println (name);

               if (name.equals ( "ben" )){
                   it.remove ();
               }
      }


        }
    }
