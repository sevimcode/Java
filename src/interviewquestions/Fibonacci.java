package interviewquestions;

public class Fibonacci{

    public static String fibonacci(int number){
        String str = "";
        int a=0;
        int b=1;
        int c=0;

        for (int i=0; i<number ; i++){

            c=a+b;
            str += c + " ";
            a=b;
            b=c;

        }

        return str;
    }

    public static void main( String[] args ) {
        System.out.println(fibonacci(10));
    }


}
