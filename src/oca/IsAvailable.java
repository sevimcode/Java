package oca;

public class IsAvailable{

    public static void main( String[] args ) {
        int x = 6;
        while (isAvailable(x)){
            System.out.println (x);
            x--;
        }
    }

    public static boolean isAvailable(int x) {
        return --x > 0 ? true : false;

    }

}//at line 7 insert x--
//prints  54321
