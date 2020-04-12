package replit;

import java.util.ArrayList;

public class Pizza{


    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        int total = 0;

        for (int i = 0;i < deliveries.size();i++) {

            total += deliveries.get(i);

        }

        if (total % max_fuel > 0)
            return (total / max_fuel) + 1;
        else
            return total / max_fuel;

    }
        public static void main( String [] args)
        {

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(3);
            arr.add(3);
            arr.add(1);
            arr.add(2);
            arr.add(6);
            int times = refuel_times(arr , 3);
            System.out.print(times);//should output 5


        }//end main

}
