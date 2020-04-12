package arrays;

public class Cars{

    public static void main( String[] args ) {

       String [] carbrands= {"toyota", "ferrari" , "bmw", "mercedes"};

       for (int i=0; i<carbrands.length ; i++)
           if (carbrands[i].equals("mercedes")) System.out.println(carbrands[i] + ": luxury comfort");
           else if (carbrands[i].equals("bmw")) System.out.println(carbrands[i]+": luxury sport");
            else if (carbrands[i].equals("toyota")) System.out.println(carbrands[i]+": reliable cheap");
            else if (carbrands[i].equals("ferrari")) System.out.println(carbrands[i]+": super car super expensive");
    }
}
