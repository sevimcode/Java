package oca;

public class ArgsLength{
    public static final int MIN=1;
    public static void main( String[] args ) {
        int x= args.length;  // args.length = 0
if (checkLimit(x))
    System.out.println(" Java SE");
else
    System.out.println("Java EE");

    }

    public static boolean checkLimit(int x){

        return (x>= MIN ? true: false);
    }
}
