package interviewquestions;

public class fib{
    public static void main( String[] args ) {
        fibonacci(20);
    }

    public static void fibonacci(int N) {
        int a = 0;
        int b = 1;  // b second number should start from 1
        int c = 0;

        System.out.println("the first " + N + "number of fibonacci");

        for (int i = 0;i < N;i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;   // 2nd will be first
            b = c;   // 3rd (sum) will be 2nd




        }

    }

}
