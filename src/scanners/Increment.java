package scanners;

public class Increment {

    public static void main ( String[] args ) {
        int age = 10;
        age += 6;  // age = age +6; short hand assignment operator
        age +=1;    // age++; post increment adds 1

        int x = 11;
        int y = x++; // does not do anything on the same line
        System.out.println ("x=" + x);
        System.out.println ("y="  + y);  // y did not get the value

        int x1 = 11;
        int y1 = ++x1;  // it increments in the same line
        System.out.println ("x1=" + x1);
        System.out.println ("y1="  + y1);

        int book = 10;

        System.out.println (book++); // effects next line

        System.out.println (" book1 " + book);

        System.out.println (++book); // effects same line output 12


        System.out.println (book--); //effects next line

        System.out.println (" book2 " + book);

        System.out.println (--book);

        int a = 10;
        int c = 8;

        System.out.println (true || a++ > c); // if  you have two line  " || " it will check true and execute, does not make increment
        System.out.println (true | a++ > c);  // if you have one line " | "  it will check both side and makes increment

        int num = 3;
        num = num++ * 10 ; // post increment does not make difference in the same line then we assign num again. We lost num=4
        System.out.println (num); // output = 30

        int num1 = 3;
        num1 = ++num1 * 10 ; // pre increment make difference in the same line then we assign num again.
        System.out.println (num1); // output = 40

        int num2 = 3;
        int num3 = num2++ * 10 ; //post increment does not change in the same line then we assign num again.

        System.out.println (num3); // output = 30
        System.out.println (num2); // output = 4

    }


}
