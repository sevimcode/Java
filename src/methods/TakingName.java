package methods;

public class TakingName{
    public static void main(String[] args){
     printName("sevim");
     firstChar("sevim");
     printName("james");

     goTo("China","London");
     email("sevim ", "surucu", 40);

    }

    public static void printName(String name){

        System.out.println(name);

    }


    public static void firstChar(String name){

        System.out.println(name.charAt(0));

    }

    public static void goTo (String origin, String newLocation){
        System.out.println("You are start from " + origin);
        System.out.println("and you are going to " + newLocation);

    }
    public static void email (String name, String lastName, int age){

        System.out.println(name+ lastName+age + "@cybertek.com");
    }


}
