package cybertekvariables;

public class CastingExample {
    public static void main ( String[] args ) {


        short chairs = 5;
        long moreChair = chairs;   // short smaller than long no need to casting implicite casting
        int lesschair = (int) moreChair; // moreChair long type data bigger than integer you need to explicite casting with (int)

        System.out.println (chairs);
        int number;
        number = 5;

        int number2, number3;   // you can declare many variable at the same time
        number2 =10;

        byte bytenum1 = (byte) number2;

        double height = 6.5;
        int intheight = (int)height;

        // we cast double height to integer intheight

        byte b = 45;
        int i = b;   //implicit casting
        short s = (short)i; //explicit casting
        System.out.println (s);

    }
}