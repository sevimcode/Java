//1) Make a Student object with instance variables: name, age, and favorite hobby.
// Also create a constructor to set the default values
//        2) Ask the user how many students they want to add to the school
//        3) Allow the user to enter each students information one at a time and add them
//        to a Map with unique ID values starting from 15
//        4) Loop through and print all the student names and their ID values
//        Ex: ID: 15 / Name: "James"
//        Ex: ID: 16 / Name: "Adam"
//        Collapse
//

package HashExample;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student{
    String name;
    int age;
    String favHobby;

    public Student(){
        name = null;
        age = 15;
        favHobby = null;
    }

    public static void main( String[] args ) {


    Scanner input = new Scanner (System.in);
    System.out.println ("How many students you want to add the school  :");
    int number = input.nextInt ();

        Map<Integer, String> map = new HashMap<> ();

        for (int i =0; i<number ; i++){
            System.out.println (" id number :");
            int id = input.nextInt ();
            input.nextLine ();
            System.out.println (" name :");
            String name = input.nextLine ();
            map.put (id, name);
        }

        for (Integer key : map.keySet ()){

            System.out.println ("ID : " + key+ " / "  + " Name: " + map.get (key));
        }


}}
