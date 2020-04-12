//Create a class School. 
//        instance variables: name, address, type 
//         
//        create a method giveHW. Method doesn’t take anything or return anything.
//        Simply print “%schoolName is giving home work”. 
//         
//        Create method hostEvent. Void method and accepts date. T
//        his method should print “Hosting an event on %date”. 
//        2. Create class CodingBootcamp Extend to School.
//        * Create object from CodingBootcamp class and see what properties and method are offered.
//        Collapse

package inheritance;

import replit.Date;

public class School{

    String name;
    String address;
    String type;

    public void giveHW(){
        System.out.println("School name: " + name);
    }
    public void hostEvent( String date){
        System.out.println("Hosting an event: " + date);
    }

}
