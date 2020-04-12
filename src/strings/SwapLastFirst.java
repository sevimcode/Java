package strings;

//swaps first character and last character

public class SwapLastFirst {
    public static void main ( String[] args ) {


        String str = "sevim";
        int length = str.length ();
        String front = str.substring ( 0, 1 );
        System.out.println (front);
        String back = str.substring ( length - 1 );
        System.out.println (back);
        String middle = str.substring ( 1,length-1 );
        System.out.println (middle);
        System.out.println (back+middle+front);

    }


}
