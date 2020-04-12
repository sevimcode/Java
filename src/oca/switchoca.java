package oca;

public class switchoca{

    public static void main( String[] args ) {
        String year = "Senior";
        switch (year) {
            case "Freshman":
            default:
            case "Sophomore":
            case "Junior":
                System.out.print("See you next year");
                break;
            case "Senior":
                System.out.print("Congratulations");

        } // prints congratulations
    }
}
