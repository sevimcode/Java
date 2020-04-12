package forloops;

public class Fulltree {

    public static void main ( String[] args ) {

        int space = 8;
        int star = -2;

        for (int i = 1; i <= 8; i++) {

            space = space - 1;
            star = star + 2;
            for (int space1 = 0; space1 <= space; space1++)
            {System.out.print ( " " );}

            for (int star1 = 0; star1 <= star; star1++)
            {System.out.print ( "*" );}


        System.out.println ();
    }}
}






















