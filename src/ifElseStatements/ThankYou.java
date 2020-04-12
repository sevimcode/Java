package ifElseStatements;

public class ThankYou {


    public static void main ( String[] args ) {



        if (4==5)  // if statement can be alone
        {
            System.out.println (" ok then");
        }
        else   // you can not use else alone
            {
                System.out.println (" thank you "); // does not finish continue other if below


             }
        if (2<90)  // it will continue to check this if too
        System.out.println (" perfect ");
        System.out.println ("come again");  // without curly braces it will execute only first line



    }


}