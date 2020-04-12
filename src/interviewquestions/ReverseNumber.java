package interviewquestions;

public class ReverseNumber{

    public static int reverseNum(int number) { //reverse int without using string
        int reversed = 0;
        int remainder = 0;

        do {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;

        } while ( number > 0 );

        return reversed;

    }

    public static void main( String[] args ) {
        System.out.println(reverseNum(1234));
    }



}
