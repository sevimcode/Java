package forloops;

public class Diamond {

    public static void main ( String[] args ) {


        int space = 3;
        int star = -1;


        for (int i = 0; i < 4; i++) {

            space = space - 1;
            star = star + 2;
            for (int space1 = 0; space1 <= space; space1++) {
                System.out.print ( " " );
            }

            for (int star1 = 1; star1 <= star; star1++) {
                System.out.print ( "*" );
            }


            System.out.println ();
        }

        space = 4;
        star = -1;

        for (int i = 0; i < 3; i++) {

            space = space - 1;
            star = star + 2;
            for (int space1 = 3; space1 >= space; space1--) {
                System.out.print ( " " );
            }

            for (int star1 = 5; star1 >= star; star1--) {
                System.out.print ( "*" );
            }


            System.out.println ();
        }

    }

}



