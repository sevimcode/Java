package cybertekvariables;


public class PrintOutExample {
    public static void main ( String[] args ) {

        int wilds = 20;
        int pets = 0;

        System.out.println ( " Pets   : " + pets );
        System.out.println ( " Wild   : " + wilds );
        System.out.println ();

        pets = 5;
        wilds -= pets; // wilds = wilds - pets

        System.out.println ( " Pets  : " + pets );
        System.out.println ( " Wild   : " + wilds );
        System.out.println ();

        wilds = wilds - pets;
        pets = pets + 5;

        System.out.println ( " Pets   : " + pets );
        System.out.println ( " Wild   : " + wilds );
        System.out.println ();





    }

}
