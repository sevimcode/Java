package interviewquestions;

public class SumofDigits{



    public static int sum (int number){
        int sum=0;
        int remainder=0;

        while(number>0) {
            remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }

        return sum;
    }

    public static void main( String[] args ) {
        System.out.println(sum(123));
    }
}
