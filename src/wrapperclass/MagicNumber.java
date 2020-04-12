//Create a class MagicNumber
//Instance variable list of integers.
//        create a method generateNumbers. This method should accept integer for size
//        and it needs to generate given size random numbers and store in list of integers.
//        Collapse
//
//

package wrapperclass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber{

     ArrayList <Integer> array = new ArrayList<>();
    Random random = new Random();

   public void magic(int size){


       for (int i = 0;i < size;i++) {


        array.add(random.nextInt(100));


       }}

    public void generateEven( int size ) {

        //array.clear();

        for (int i = 0;i < size;i++) {

            int a = random.nextInt(100);

            if (a % 2 == 0)
                array.add(a);
            else
                i--;  // if it is not even ask again that s why i-- // you can do it with while (true)

        }

    }

   }


