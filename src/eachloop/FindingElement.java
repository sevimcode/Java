//1) Write a program and create String array called cities. Initialize the cities with cities below:
//        Chicago, New York, Madison, Miami, Washington
//        Iterate through each city and check if Chicago is inside the cities.
//        Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.
//

package eachloop;

public class FindingElement {

    public static void main ( String[] args ) {

        String [] cities = {"Chicago", "New York", "Madison", "Miami"," Washington" };
         boolean check= false;
          int count =0;

        for (String city : cities){   //  for ( datatypeofelement    nameofelement : collection name)
         if (city.equalsIgnoreCase("Chicago")) { // we find the element
             check = true;
             count++;

         }
        }

        if (check){
        System.out.println ("windy city found! " + count + " times " );
        }
        else{
            System.out.println ("windy city  not found!" );
        }


    }

}
